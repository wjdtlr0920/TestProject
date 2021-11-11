package com.js.testproject.viewtest.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityTextViewBinding

class TextViewActivity : AppCompatActivity() {

  lateinit var binding : ActivityTextViewBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityTextViewBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.ellipeTest


  }
}