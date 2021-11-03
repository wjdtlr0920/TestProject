package com.js.testproject.fastcampus.rotto

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.databinding.ActivityLottoBinding

class LottoActivity : AppCompatActivity() {

  private lateinit var binding: ActivityLottoBinding

  @RequiresApi(Build.VERSION_CODES.N)
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityLottoBinding.inflate(layoutInflater)
    setContentView(binding.root)


//    로또번호 Type1
//
//    val lottoNumberMutableList = mutableListOf<Int>()
//    val random = Random(Calendar.getInstance().timeInMillis)
//
//    while (lottoNumberMutableList.size < 6){
//      val randomNumber = random.nextInt(45) + 1
//      if (lottoNumberMutableList.contains(randomNumber))
//        continue
//
//      lottoNumberMutableList.add(randomNumber)
//    }
//    Logger.d(lottoNumberMutableList)


//    로또번호 Type2
//
//    val lottoNumberMutableSet = mutableListOf<Int>()
//    val random = Random(Calendar.getInstance().timeInMillis)
//
//    while (lottoNumberMutableSet.size < 6){
//      val randomNumber = random.nextInt(45) + 1
//      lottoNumberMutableSet.add(randomNumber)
//    }
//    Logger.d(lottoNumberMutableSet)


//    로또번호 Type3
//
//    val lottoNumberList = mutableListOf<Int>().apply {
//      for (i in 1..45)
//        add(i)
//    }
//    val random = Random(Calendar.getInstance().timeInMillis)
//
//    lottoNumberList.shuffle()
//    Logger.d(lottoNumberList.subList(0, 6))
  }
}