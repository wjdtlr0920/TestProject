package com.js.testproject.util

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.adapter.ActivityOpenAdapter
import com.js.testproject.databinding.ActivityUtilBinding
import com.js.testproject.fastcampus.rotto.LottoActivity
import com.js.testproject.file.FileTestActivity
import com.js.testproject.mediastore.MediaStoreActivity
import com.js.testproject.notification.NotificationActivity
import com.js.testproject.permission.PermissionActivity
import com.js.testproject.stack.StackActivity
import com.js.testproject.util.calendar.CalendarActivity
import com.js.testproject.util.random.RandomActivity
import com.js.testproject.viewtest.ViewTestActivity

class UtilActivity : AppCompatActivity() {

  private lateinit var binding: ActivityUtilBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityUtilBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val classList = arrayListOf<Class<*>>()

    classList.add(RandomActivity::class.java)
    classList.add(CalendarActivity::class.java)

    binding.rvUtil.adapter = ActivityOpenAdapter(this, classList)
  }
}