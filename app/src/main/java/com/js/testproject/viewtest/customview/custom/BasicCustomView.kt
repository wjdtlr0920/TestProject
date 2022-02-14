package com.js.testproject.viewtest.customview.custom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import com.orhanobut.logger.Logger

class BasicCustomView @JvmOverloads constructor(
  context: Context, attrs: AttributeSet? = null,
  defStyleAttr: Int = 0
) : TextView(context, attrs, defStyleAttr) {


  override fun onDraw(canvas: Canvas?) {

    Logger.e("onDraw")
    canvas?.let {
      Logger.e("canvas?.let")
      it.translate(30.0f,0.0f)
      it.rotate(20.5f)
      val paint =  Paint()
		  paint.color = Color.GREEN
      it.drawColor(Color.parseColor("#555555"))
      it.drawRect(50f, 100f, 50+100f, 80f, paint)
    }

    super.onDraw(canvas)

  }
}