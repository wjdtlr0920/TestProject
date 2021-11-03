package com.js.testproject.util.calendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityCalendarBinding
import com.orhanobut.logger.Logger
import java.util.*

class CalendarActivity : AppCompatActivity() {

  private lateinit var binding: ActivityCalendarBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityCalendarBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.currentTime.setOnClickListener {

      val currentCalendar = Calendar.getInstance()

      Logger.d(currentCalendar)
      Logger.d(
        "${currentCalendar.get(Calendar.YEAR)} ${currentCalendar.get(Calendar.MONTH)} ${
          currentCalendar.get(
            Calendar.DAY_OF_MONTH
          )
        } ${currentCalendar.get(Calendar.HOUR)} ${currentCalendar.get(Calendar.MINUTE)} ${
          currentCalendar.get(
            Calendar.SECOND
          )
        }"
      )
    }

    // 캘린터 set으로 날짜를 넘는 숫자를 넣어주면 인스턴스 안에서 저절로 날짜를 바꿔줌
    binding.monthNum.setOnClickListener {
      for (i in 0..100) {
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.MONTH, i)

        Logger.d(
          "${calendar.get(Calendar.YEAR)} ${calendar.get(Calendar.MONTH)} ${
            calendar.get(
              Calendar.DAY_OF_MONTH
            )
          } ${calendar.get(Calendar.HOUR)} ${calendar.get(Calendar.MINUTE)} ${
            calendar.get(
              Calendar.SECOND
            )
          }"
        )
      }
    }
  }
}