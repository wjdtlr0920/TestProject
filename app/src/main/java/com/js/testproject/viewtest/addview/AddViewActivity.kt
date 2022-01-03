package com.js.testproject.viewtest.addview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import com.js.testproject.databinding.ActivityAddViewBinding

class AddViewActivity : AppCompatActivity() {

  private lateinit var binding: ActivityAddViewBinding

  var count = 1

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityAddViewBinding.inflate(layoutInflater)
    setContentView(binding.root)


    binding.testButton.setOnClickListener {
      binding.gridView.addView(
        TextView(this).apply {

          val density = context.resources.displayMetrics.density
          val height = 200 * density

          layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, height.toInt())
          text = "테스트중입니다 ${count++}"
        }
      )
    }
  }
}