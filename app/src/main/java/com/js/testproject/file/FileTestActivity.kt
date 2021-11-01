package com.js.testproject.file

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.js.testproject.databinding.ActivityFileTestBinding
import com.orhanobut.logger.Logger

class FileTestActivity : AppCompatActivity() {

  private lateinit var binding : ActivityFileTestBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityFileTestBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.fileSelect.setOnClickListener {
      val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
        type = "application/*"
      }
      registerFile.launch(intent)
    }
  }

  private val registerFile = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ data ->
    Logger.e(data.data.toString())
  }
}