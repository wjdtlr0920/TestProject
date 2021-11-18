package com.js.testproject.viewtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.js.testproject.R
import com.js.testproject.adapter.ActivityOpenAdapter
import com.js.testproject.databinding.ActivityViewTestBinding
import com.js.testproject.viewtest.etc.EtcActivity
import com.js.testproject.viewtest.textinputlayout.TextInputLayoutActivity
import com.js.testproject.viewtest.textview.TextViewActivity

class ViewTestActivity : AppCompatActivity() {

    private lateinit var binding : ActivityViewTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_test)

        val classList = arrayListOf<Class<*>>()
        classList.add(TextInputLayoutActivity::class.java)
        classList.add(TextViewActivity::class.java)
        classList.add(EtcActivity::class.java)

        binding.recyclerview.adapter = ActivityOpenAdapter(this, classList)
    }
}