package com.js.testproject.viewtest.textview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.databinding.ActivityTextViewBinding

class TextViewActivity : AppCompatActivity() {

  lateinit var binding : ActivityTextViewBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityTextViewBinding.inflate(layoutInflater)
    setContentView(binding.root)

    // 테스트중…이빈다
    binding.ellipeTest.post {
      if(binding.ellipeTest.layout.text.contains("…")) {
        binding.ellipeTest.text = binding.ellipeTest.layout.text.split("…")[0]
      }

//      while ( binding.ellipeTest.layout.text.toString() !=  binding.ellipeTest.text.toString()) {
//        binding.ellipeTest.text =  binding.ellipeTest.text.dropLast(1)
//      }

//      Logger.e("ellipeTest : ${binding.ellipeTest.text}")
//      Logger.e("ellipeTest.layout : ${binding.ellipeTest.layout.text}")
    }
  }
}