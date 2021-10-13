package com.js.testproject.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.js.testproject.R
import com.js.testproject.adapter.ActivityOpenAdapter
import com.js.testproject.databinding.ActivityMainBinding
import com.js.testproject.notification.NotificationActivity
import com.js.testproject.permission.PermissionActivity
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

        binding.rvMain.adapter = ActivityOpenAdapter(this, classList)
    }
}