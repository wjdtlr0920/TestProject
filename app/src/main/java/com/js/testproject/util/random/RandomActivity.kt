package com.js.testproject.util.random

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.databinding.ActivityRandomBinding
import com.orhanobut.logger.Logger
import java.util.*
import kotlin.random.Random

class RandomActivity : AppCompatActivity() {

  private lateinit var binding: ActivityRandomBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityRandomBinding.inflate(layoutInflater)
    setContentView(binding.root)


    binding.nextInt.setOnClickListener {

      val currentTime = Calendar.getInstance().timeInMillis

      val random = Random(currentTime)
      for (i in 0..6)
        Logger.d("${random.nextInt(45)+1}")
    }
  }
}