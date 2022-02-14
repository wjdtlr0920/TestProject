package com.js.testproject.base.application

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


/**
 * BaseApplication
 *
 * */
class BaseApplication : Application() {
  override fun onCreate() {
    super.onCreate()

    // orhanobut 로그 라이브러리 사용하려면 어댑터 추가해줘야 함(앱 전역에서 사용해야하니 어플리케이션 단에 선언해 주는게 좋아보임, Activity에 선언시 사용가능)
    Logger.addLogAdapter(AndroidLogAdapter())
  }
}