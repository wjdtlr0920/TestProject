package com.js.testproject.viewtest.motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityMotionLayoutBinding

class MotionLayoutActivity : AppCompatActivity() {

  val binding : ActivityMotionLayoutBinding by lazy {
    ActivityMotionLayoutBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)


  }
}