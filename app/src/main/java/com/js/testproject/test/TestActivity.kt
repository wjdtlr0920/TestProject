package com.js.testproject.test

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.databinding.ActivityTestBinding
import com.js.testproject.test.string.StringActivity
import com.orhanobut.logger.Logger
import kotlin.properties.Delegates


class TestActivity : AppCompatActivity() {

  lateinit var binding: ActivityTestBinding

  @Volatile
  private var volatileTest = 1

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityTestBinding.inflate(layoutInflater)
    setContentView(binding.root)

    var asd : String by Delegates.observable("111") { prop, old, new -> println("$old -> $new") }

    asd = "asd"
    asd = "asd2"

    var asd2 : Int by Delegates.observable(1) { prop, old, new -> println("$old -> $new") }

    asd2 = 1
    asd2 = 2
    asd2 = 3




//    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)

    val item = ArrayList<String>()
    item.add("1")
    item.add("112")
    item.add("1113")
    item.add("11114")

    binding.searchView.setAdapter(
      ArrayAdapter(this, R.layout.simple_dropdown_item_1line, item)
    )
    binding.stringActivity.setOnClickListener {
      startActivity(Intent(this, StringActivity::class.java))
    }

    var count = 1

    binding.companion.setOnClickListener {
      CompanionTest.token = count.toString()
      count++
    }

    binding.companion2.setOnClickListener {
      Logger.e(CompanionTest.token)
      Logger.e("왜 안되는 것이냐")
    }







//    binding.biometricActivity.setOnClickListener {
//      startActivity(Intent(this, BiometricActivity::class.java))
//    }
//
//    binding.taskActivity.setOnClickListener {
//      val am: ActivityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
//      val taskInfo: List<ActivityManager.RunningTaskInfo> = am.getRunningTasks(1)
//      val componentInfo: ComponentName = taskInfo[0].topActivity!!
//      Logger.e(componentInfo.packageName.contains(packageName).toString())
//    }
  }


  fun runnableTest(){
    binding.VolatileTest.setOnClickListener {

      var count = 1

      while (count < 1000){
        Thread {
          Logger.e(count++.toString())
        }.start()
      }
    }

    binding.VolatileTest2.setOnClickListener {

      while (volatileTest < 1000){
        Thread {
          Logger.e(volatileTest++.toString())
        }.start()
      }

      volatileTest = 1
    }

    binding.VolatileTest3.setOnClickListener {

      var count = 1

      synchronized(this) {
        while (count < 1000) {
          Thread {
            Logger.e(count++.toString())
          }.start()
        }
      }
    }

    binding.VolatileTest4.setOnClickListener {

      synchronized(this) {
        while (volatileTest < 1000) {
          Thread {
            Logger.e(volatileTest++.toString())
          }.start()
        }
      }
    }

    volatileTest = 1
  }

}