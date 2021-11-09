package com.js.testproject.kakao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityKakaoBinding

class KakaoActivity : AppCompatActivity() {

  private lateinit var binding : ActivityKakaoBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    binding = ActivityKakaoBinding.inflate(layoutInflater)
    super.onCreate(savedInstanceState)
    setContentView(binding.root)



    

  }
}