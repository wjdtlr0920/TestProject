package com.js.testproject.pretendcall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityPretendCallBinding

class PretendCallActivity : AppCompatActivity() {
  lateinit var binding : ActivityPretendCallBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityPretendCallBinding.inflate(layoutInflater)
    setContentView(binding.root)

//    SimpleWorker(this, )


  }
}