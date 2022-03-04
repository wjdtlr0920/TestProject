package com.js.testproject.gurucoin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.zxing.integration.android.IntentIntegrator
import com.js.testproject.databinding.ActivityGuruCoinBinding
import com.orhanobut.logger.Logger

import com.journeyapps.barcodescanner.CaptureActivity
import java.io.InputStream
import java.io.OutputStream
import java.util.*
import javax.activation.DataHandler
import javax.mail.BodyPart
import javax.mail.Header
import javax.mail.Multipart
import javax.mail.internet.MimeBodyPart
import javax.mail.internet.MimeMultipart


class GuruCoinActivity : AppCompatActivity() {

  val binding : ActivityGuruCoinBinding by lazy {
    ActivityGuruCoinBinding.inflate(layoutInflater)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(binding.root)

    binding.qrScan.setOnClickListener {

      IntentIntegrator(this).apply {
       setBarcodeImageEnabled(false)
       setBeepEnabled(true)
       setPrompt("QR 코드를 읽어주세요")
       setDesiredBarcodeFormats(IntentIntegrator.QR_CODE)
       captureActivity = CaptureActivity::class.java
      }.initiateScan()
    }

    binding.qrMake.setOnClickListener {


      val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://bit.ly/2pY6Xp8"))
      startActivity(intent)

    }
  }

  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)

    Logger.e("onActivityResult $data")

    val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
    if (result != null) {
      if (result.contents == null) {
        Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show()
      } else {
        //result.getContents 를 이용 데이터 재가공
        Toast.makeText(this, "Scanned: " + result.contents, Toast.LENGTH_LONG).show()
        startActivity(Intent())

      }
    } else {
      super.onActivityResult(requestCode, resultCode, data)
    }



  }
}