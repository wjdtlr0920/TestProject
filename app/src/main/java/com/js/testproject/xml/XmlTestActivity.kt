package com.js.testproject.xml

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.testproject.databinding.ActivityXmlTestBinding
import com.orhanobut.logger.Logger

class XmlTestActivity : AppCompatActivity() {

  private val binding : ActivityXmlTestBinding by lazy {
    ActivityXmlTestBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)

    if (Intent.ACTION_SEARCH == intent.action) {
      intent.getStringExtra(SearchManager.QUERY)?.also { query ->
        doMySearch(query)
      }
    }
  }


  private fun doMySearch(query : String){
    Logger.e(query)
  }

}