package com.js.testproject.viewtest.etc

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityEtcBinding
import com.orhanobut.logger.Logger

class EtcActivity : AppCompatActivity() {
  private lateinit var binding: ActivityEtcBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityEtcBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.buttonAnimation.setOnClickListener {
      val startScaleX = ObjectAnimator.ofFloat(binding.buttonAnimation, "scaleX", 0.1f, 1f)
//      startScaleX.start()

      val startScaleY = ObjectAnimator.ofFloat(binding.buttonAnimation, "scaleY", 0.1f, 1f)
//      startScaleX.start()

//      val startScaleY = ObjectAnimator.ofFloat(binding.buttonAnimation, "scaleY", 0.1f)
//      val endScaleX = ObjectAnimator.ofFloat(binding.buttonAnimation, "scaleX", 1f)
//      val endScaleY = ObjectAnimator.ofFloat(binding.buttonAnimation, "scaleY", 1f)
//
//      startScaleX.duration = 1000L
//      startScaleY.duration = 1000L
//      endScaleX.duration = 1000L
//      endScaleY.duration = 1000L
//
      val animatorSet = AnimatorSet()
      animatorSet.playTogether(
        startScaleX,
        startScaleY
      )
//
      animatorSet.start()

      Logger.e("animatorSet.start()")
    }


    binding.buttonTest2.setOnClickListener {

      val startScaleX = ObjectAnimator.ofFloat(binding.buttonTest2,"scaleX", 1.03f, 0.9f, 1f)
      val startScaleY = ObjectAnimator.ofFloat(binding.buttonTest2,"scaleY", 1.03f, 0.9f, 1f)

      AnimatorSet().apply {
        playTogether(startScaleX, startScaleY)
      }.start()

    }

  }
}