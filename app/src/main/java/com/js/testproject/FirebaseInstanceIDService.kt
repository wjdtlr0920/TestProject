package com.js.testproject

import android.annotation.SuppressLint
import android.app.*
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import android.os.PowerManager
import android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.js.testproject.main.MainActivity
import com.js.testproject.test.TestActivity
import com.orhanobut.logger.Logger

class FirebaseInstanceIDService : FirebaseMessagingService() {

  override fun onNewToken(token: String) {
    super.onNewToken(token)
    Logger.e("FirebaseInstanceIDService $token")
  }

  @SuppressLint("InvalidWakeLockTag")
  override fun onMessageReceived(remoteMessage: RemoteMessage) {
    super.onMessageReceived(remoteMessage)

    Logger.e("onMessageReceived")

    val am: ActivityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager

    val topActivityName = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
      if (am.appTasks.isNotEmpty()) am.appTasks[0].taskInfo.topActivity.toString() else ""
    } else {
      val info = am.getRunningTasks(1)
      val componentName = info[0].topActivity
      componentName!!.shortClassName.substring(1)
    }

    Logger.e("아아아아아 : " + topActivityName.contains(packageName).toString())


//    val am: ActivityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
//    val taskInfo: List<ActivityManager.RunningTaskInfo> = am.getRunningTasks(1)
//    val componentInfo: ComponentName = taskInfo[0].topActivity!!
//    Logger.e("아아아아아 : "+componentInfo.packageName.contains(packageName).toString())


    val requestCode = System.currentTimeMillis().toInt()

    val powerManager = getSystemService(Context.POWER_SERVICE) as PowerManager

    // 알람이 오면 화면을 깨움.
    val wakeLock = powerManager.newWakeLock(
      FLAG_KEEP_SCREEN_ON or
              PowerManager.ACQUIRE_CAUSES_WAKEUP, "WAKELOCK"
    )

    wakeLock.acquire(3000)
    wakeLock.release()

    val title = remoteMessage.data["title"]
    val content = remoteMessage.data["body"]

    val channelId = "aaaa"

    val notificationManager: NotificationManager =
      getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
      val channelName = "happyhabit"
      val channel =
        NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH)
      notificationManager.createNotificationChannel(channel)
    }

    val pendingIntent = PendingIntent.getActivity(
      this,
      requestCode,
      Intent(this, TestActivity::class.java),
      PendingIntent.FLAG_UPDATE_CURRENT
    )
    val defaultSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)

    val notificationBuilder =
      NotificationCompat.Builder(this, channelId)
        .setContentTitle(title)
        .setContentText(content)
        .setSmallIcon(R.drawable.common_google_signin_btn_icon_dark)
        .setAutoCancel(true)
        .setPriority(NotificationCompat.PRIORITY_HIGH)
        .setStyle(NotificationCompat.BigTextStyle())
        .setVibrate(longArrayOf(1000, 1000))
        .setDefaults(Notification.DEFAULT_ALL)
        .setSound(defaultSound)
        .setSmallIcon(R.drawable.common_google_signin_btn_icon_dark)
        .setContentIntent(pendingIntent)

    notificationManager.notify(0, notificationBuilder.build())
  }
}