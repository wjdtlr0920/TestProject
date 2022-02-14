package com.js.testproject.composetest

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.material.Text
import androidx.compose.ui.tooling.preview.Preview

class ComposeTestActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MessageCard("Compose")
    }
  }
}


@Preview
@Composable
fun MessageCard(name: String) {
  Text(text = "Hello $name!")
}