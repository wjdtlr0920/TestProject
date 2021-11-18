package com.js.testproject.test.string

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.databinding.ActivityStringBinding
import com.orhanobut.logger.Logger

class StringActivity : AppCompatActivity() {

  lateinit var binding : ActivityStringBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityStringBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.substringTest1.setOnClickListener {
      val str = "test..."
      Logger.e(str.contains("...").toString())
    }

  }
}