package com.js.testproject.test

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.databinding.ActivityTestBinding
import com.js.testproject.test.string.StringActivity


class TestActivity : AppCompatActivity() {

  lateinit var binding: ActivityTestBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityTestBinding.inflate(layoutInflater)
    setContentView(binding.root)

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
}