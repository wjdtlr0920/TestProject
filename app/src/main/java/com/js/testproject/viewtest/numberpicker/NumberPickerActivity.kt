package com.js.testproject.viewtest.numberpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityNumberPickerBinding

class NumberPickerActivity : AppCompatActivity() {

  val binding : ActivityNumberPickerBinding by lazy {
    ActivityNumberPickerBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)

    binding.numberPicker1

  }
}