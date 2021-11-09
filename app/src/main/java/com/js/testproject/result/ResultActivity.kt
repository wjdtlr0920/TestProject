package com.js.testproject.result

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.R
import com.js.testproject.databinding.ActivityResultBinding
import com.orhanobut.logger.Logger

class ResultActivity : AppCompatActivity() {

  lateinit var binding : ActivityResultBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityResultBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val requestCode = 7777

    binding.resultCode.setOnClickListener {
      startActivityForResult(Intent(this, ResultActivity::class.java), requestCode)
      Logger.e("$requestCode")
    }
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    Logger.e("$requestCode $resultCode")
  }

}