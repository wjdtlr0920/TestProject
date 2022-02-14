package com.js.testproject.headerfooter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityHeaderFooterBinding

class HeaderFooterActivity : AppCompatActivity() {

  val binding : ActivityHeaderFooterBinding by lazy {
    ActivityHeaderFooterBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)

    



  }
}