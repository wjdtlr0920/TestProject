package com.js.testproject.stack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.js.testproject.R
import com.js.testproject.databinding.ActivityStackBinding

class StackActivity : AppCompatActivity() {

    private lateinit var binding : ActivityStackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStackBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}