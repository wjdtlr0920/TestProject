package com.js.testproject.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.BindingAdapter
import com.js.testproject.R
import com.orhanobut.logger.Logger
import kotlinx.coroutines.*

class CoroutineActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_coroutine)

//    val job = CoroutineScope(Dispatchers.Default)
//
//    job.launch(Dispatchers.IO) {
//
//    }
//
//
//    CoroutineScope(Dispatchers.Default).launch {
//      job.cancel()
//      delay(1000)
//      Logger.e("2222")
//    }
//
//    Job()
//
//
//    val job = CoroutineScope(Dispatchers.Default).async {
//
//      delay(2000)
//      Logger.e("1111")
//      "1111"
//
//    }
//
//
//
//    CoroutineScope(Dispatchers.Default).async {
//
////      job.cancel()
//      delay(1000)
//      val aaa = job.await()
//      Logger.e("2222 : $aaa")
//    }
//
//  }
//
//  fun asd (){
//
  }
}