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

    // marquee(흐르는 텍스트)를 적용할때는 선택한 처리를 해줘야한다
    // lines = 1, maxLines = 1 으로 줘도 동작안함 singleLine = true를 줘야함
    binding.ellipeMarqueeTest.isSelected = true



  }
}