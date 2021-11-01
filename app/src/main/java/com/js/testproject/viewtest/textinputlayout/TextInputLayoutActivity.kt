package com.js.testproject.viewtest.textinputlayout

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.internal.TextWatcherAdapter
import com.js.testproject.databinding.ActivityTextInputLayoutBinding
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


class TextInputLayoutActivity : AppCompatActivity() {

    private lateinit var binding : ActivityTextInputLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTextInputLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 에러 메세지 표기
        binding.editError.addTextChangedListener(watcher)


    }


    // 에러 메세지 표기
    private val watcher = object : TextWatcherAdapter() {
        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            if (s.isEmpty())
                binding.inputError.error = "글자를 입력해주세요"
            else {
//                아래 두가지 다 사용가능
                binding.inputError.error = null
//                binding.inputError.error = ""
            }
        }
    }




}