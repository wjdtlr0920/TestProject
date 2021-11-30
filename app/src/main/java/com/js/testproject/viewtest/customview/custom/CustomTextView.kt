package com.js.testproject.viewtest.customview.custom

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import com.js.testproject.R

class CustomTextView @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = 0
) : TextView(context, attrs, defStyleAttr) {

  override fun setText(text: CharSequence?, type: BufferType?) {
    val customText = "커스텀 테스트 : $text"
    super.setText(customText, type)
  }

  private fun setAttr(){

  }

}