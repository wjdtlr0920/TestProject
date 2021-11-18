package com.js.testproject.viewtest.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.R
import com.js.testproject.databinding.ActivityCustomViewBinding

class CustomViewActivity : AppCompatActivity() {

  lateinit var binding : ActivityCustomViewBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityCustomViewBinding.inflate(layoutInflater)
    setContentView(binding.root)





  }
}