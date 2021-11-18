package com.js.testproject.test

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.databinding.ActivityTestBinding
import com.js.testproject.test.string.StringActivity

class TestActivity : AppCompatActivity() {

  lateinit var binding : ActivityTestBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityTestBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.stringActivity.setOnClickListener {
      startActivity(Intent(this, StringActivity::class.java))
    }

  }
}