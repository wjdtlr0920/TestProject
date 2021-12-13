package com.js.testproject.pretendcall

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.orhanobut.logger.Logger

class SimpleWorker(context: Context, workerParameters: WorkerParameters) : Worker(context, workerParameters){
  override fun doWork(): Result {
    return kotlin.runCatching {

      Logger.e("SimpleWorker doWork")

      Result.success()

    }.onSuccess {
      Result.success()
    }.onFailure {
      Result.failure()
    }.getOrNull()!!
  }
}