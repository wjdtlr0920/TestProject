package com.js.testproject.viewtest.dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import android.widget.AbsListView
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.js.testproject.R
import com.js.testproject.databinding.ActivityDialogTestBinding
import com.orhanobut.logger.Logger
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DialogTestActivity : AppCompatActivity() {

  lateinit var binding : ActivityDialogTestBinding
  lateinit var positionX : String

  override fun onCreate(savedInstanceState: Bundle?) {
    binding = ActivityDialogTestBinding.inflate(layoutInflater)
    super.onCreate(savedInstanceState)
    setContentView(binding.root)

    binding.dialogTest.setOnClickListener {
      binding.dialogTest.visibility = View.VISIBLE
      binding.positionTest.visibility = View.VISIBLE
      binding.stackTest.visibility = View.VISIBLE
      binding.stackTest2.visibility = View.VISIBLE
    }

    binding.positionTest.setOnClickListener {
      binding.positionTest.visibility = View.GONE
    }

    binding.stackTest.setOnClickListener {
      binding.stackTest.visibility = View.INVISIBLE
    }

    binding.stackTest2.setOnClickListener {
      binding.stackTest2.visibility = View.GONE
    }


//    binding.dialogTest.setOnClickListener {
//      CoroutineScope(Dispatchers.Main).launch {
//        val contextTest = this@DialogTestActivity
//
//        delay(2000)
//
//        if (!(contextTest).isFinishing)
//          MaterialAlertDialogBuilder(contextTest).show()
//      }
//
////      binding.dialogTest.backgroundTintList = ContextCompat.getColorStateList(this, R.color.red)
//
//    }

//    binding.positionTest.viewTreeObserver.addOnGlobalLayoutListener( object : ViewTreeObserver.OnGlobalLayoutListener {
//      override fun onGlobalLayout() {
//        positionX = "123"
//        Logger.e(positionX)
//        binding.positionTest.viewTreeObserver.removeOnGlobalLayoutListener(this)
//      }
//    })

//    binding.recyclerview.addOnScrollListener( object : RecyclerView.OnScrollListener() {
//      override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
//        super.onScrollStateChanged(recyclerView, newState)
//        Logger.e(positionX)
//      }
//
//      override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
//        super.onScrolled(recyclerView, dx, dy)
//        Logger.e(positionX)
//      }
//    })

//    binding.positionTest.setOnClickListener(object : View.OnClickListener {
//      override fun onClick(v: View?) {
//        Logger.e(positionX)
//      }
//    })

//    binding.positionTest.setOnClickListener {
//      Logger.e(positionX)
//    }
  }
}