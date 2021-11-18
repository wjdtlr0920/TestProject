package com.js.testproject.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import com.js.testproject.databinding.ActivityIntentBinding
import com.js.testproject.intent.intenttrans.IntentTransActivity

class IntentActivity : AppCompatActivity() {

  lateinit var binding : ActivityIntentBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityIntentBinding.inflate(layoutInflater)
    setContentView(binding.root)


    binding.intentTransTest.setOnClickListener {
      val activityTans = ActivityOptionsCompat.makeSceneTransitionAnimation(this, binding.intentTransTest, "123")
      startActivity(Intent(this, IntentTransActivity::class.java), activityTans.toBundle())

    }
  }
}