package com.js.testproject.intent.intenttrans

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityIntentTransBinding
import com.orhanobut.logger.Logger

class IntentTransActivity : AppCompatActivity() {

  lateinit var binding : ActivityIntentTransBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityIntentTransBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.intentTransTest.setOnClickListener {
      supportFinishAfterTransition()
    }
  }

  override fun onEnterAnimationComplete() {
    super.onEnterAnimationComplete()
    Logger.e("onEnterAnimationComplete")
  }
}