package com.js.testproject.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.js.testproject.R
import com.js.testproject.main.adapter.MainAdapter
import com.js.testproject.databinding.ActivityMainBinding
import com.js.testproject.main.data.model.MainRecyclerModel
import com.js.testproject.notification.NotificationActivity
import com.js.testproject.viewtest.ViewTestActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val classList = arrayListOf<Class<*>>()
        classList.add(NotificationActivity::class.java)
        classList.add(ViewTestActivity::class.java)

        binding.rvMain.adapter = MainAdapter(this, classList)

    }
}