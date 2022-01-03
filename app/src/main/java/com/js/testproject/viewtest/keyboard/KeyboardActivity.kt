package com.js.testproject.viewtest.keyboard

import android.graphics.Rect
import android.os.Bundle
import android.view.ViewTreeObserver
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.databinding.ActivityKeyboardBinding
import com.orhanobut.logger.Logger

class KeyboardActivity : AppCompatActivity() {

  lateinit var binding: ActivityKeyboardBinding

  var heightMax = 0
  val rootViewRect = 0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityKeyboardBinding.inflate(layoutInflater)
    setContentView(binding.root)


//    binding.button.setOnClickListener {
//
//      Logger.e("binding.textview.y = ${binding.textview.y} \nbinding.button.height = ${binding.button.height} \nbinding.textview.y - binding.button.height.toFloat() = ${binding.textview.y - binding.button.height.toFloat()}")
//
//      binding.textview.y = binding.textview.y - binding.button.height.toFloat()
//
//      Logger.e("${binding.textview.y}")
//
//
//    }
//
//    binding.button2.setOnClickListener {
//
//      Logger.e("binding.textview.y = ${binding.textview.y} \nbinding.button.height = ${binding.button.height} \nbinding.textview.y - binding.button.height.toFloat() = ${binding.textview.y - binding.button.height.toFloat()}")
//
//      binding.textview.y = binding.textview.y +z binding.button.height.toFloat()
//
//      Logger.e("${binding.textview.y}")
//
//    }


    binding.root.viewTreeObserver.addOnGlobalLayoutListener {


      val resourceId = resources.getIdentifier("navigation_bar_height", "dimen", "android")
      val navigationView = resources.getDimensionPixelSize(resourceId)



      val rect = Rect()
      binding.root.rootView.getWindowVisibleDisplayFrame(rect)

      Logger.e(" binding.root.rootView.bottom ${binding.root.rootView.bottom}")
      Logger.e(" rect.bottom ${rect.bottom}")

      if (rect.bottom > heightMax)
        heightMax = rect.bottom

      val keyboardHeight = heightMax - rect.bottom

//      binding.editText2.y = (rect.bottom - keyboardHeight - binding.editText2.height - navigationView).toFloat()
      binding.editText2.y = (rect.bottom - binding.editText2.height - navigationView).toFloat()

      Logger.e(" keyboardHeight $keyboardHeight")

    }

//    binding.editTest2.setOnFocusChangeListener { v, hasFocus ->
//
//      when(v){
//        binding.editTest2 -> {
//          if (hasFocus){
//            val paddingTop = binding.editTest2.paddingTop
//            val paddingStart = binding.editTest2.paddingStart
//            val paddingEnd = binding.editTest2.paddingEnd
//            binding.editTest2.setPadding(paddingStart ,paddingTop, paddingEnd, 200)
////            val layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
////              binding.editTest2.layoutParams = layoutParams
//          }
//        }
//      }

    binding.root.viewTreeObserver.addOnGlobalLayoutListener(globalLayoutListener)

//    val layout = binding.container
//    val constraintSet = ConstraintSet()
//    constraintSet.clone(layout)
//    constraintSet.connect(binding.test2.id, ConstraintSet.TOP, binding.test1.id, ConstraintSet.BOTTOM)
//    constraintSet.applyTo(layout)

  }

  private val globalLayoutListener = ViewTreeObserver.OnGlobalLayoutListener {

    val rect = Rect()
    binding.root.getWindowVisibleDisplayFrame(rect)
    if (rect.bottom > heightMax)
      heightMax = rect.bottom

    val keyboardHeight = heightMax - rect.bottom

  }
}