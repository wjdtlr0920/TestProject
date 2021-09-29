package com.js.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.js.testproject.adapter.MainAdapter
import com.js.testproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val testList = resources.getStringArray(R.array.test_list)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.rvMain.adapter = MainAdapter(testList)


    }
}