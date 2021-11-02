package com.js.testproject.util

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.databinding.ActivityUtilBinding
import com.js.testproject.util.random.RandomActivity

class UtilActivity : AppCompatActivity() {

  private lateinit var binding: ActivityUtilBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityUtilBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.randomActivity.setOnClickListener {
      startActivity(Intent(this, RandomActivity::class.java))
    }
  }
}