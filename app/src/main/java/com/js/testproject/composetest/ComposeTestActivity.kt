package com.js.testproject.composetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.js.testproject.R

class ComposeTestActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_compose_test)
//    setContent {
//      MessageCard("Compose")
//    }
  }
}


//@Preview
//@Composable
//fun MessageCard(name: String) {
//  Text(text = "Hello $name!")
//}