package com.js.testproject.viewtest.textinputlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.R
import com.js.testproject.databinding.ActivityTextInputLayoutBinding

class TextInputLayoutActivity : AppCompatActivity() {

    private val binding = ActivityTextInputLayoutBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }
}