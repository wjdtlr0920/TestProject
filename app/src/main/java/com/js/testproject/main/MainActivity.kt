package com.js.testproject.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.js.testproject.R
import com.js.testproject.adapter.ActivityOpenAdapter
import com.js.testproject.databinding.ActivityMainBinding
import com.js.testproject.fastcampus.rotto.LottoActivity
import com.js.testproject.file.FileTestActivity
import com.js.testproject.mediastore.MediaStoreActivity
import com.js.testproject.notification.NotificationActivity
import com.js.testproject.permission.PermissionActivity
import com.js.testproject.result.ResultActivity
import com.js.testproject.stack.StackActivity
import com.js.testproject.util.UtilActivity
import com.js.testproject.viewtest.ViewTestActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val classList = arrayListOf<Class<*>>()
        classList.add(NotificationActivity::class.java)
        classList.add(ViewTestActivity::class.java)
        classList.add(PermissionActivity::class.java)
        classList.add(StackActivity::class.java)
        classList.add(FileTestActivity::class.java)
        classList.add(MediaStoreActivity::class.java)
        classList.add(UtilActivity::class.java)
        classList.add(LottoActivity::class.java)
        classList.add(ResultActivity::class.java)

        binding.rvMain.adapter = ActivityOpenAdapter(this, classList)

    }
}