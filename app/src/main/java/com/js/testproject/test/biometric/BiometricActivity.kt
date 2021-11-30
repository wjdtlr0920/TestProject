package com.js.testproject.test.biometric

import android.app.KeyguardManager
import android.hardware.biometrics.BiometricManager.Authenticators.BIOMETRIC_STRONG
import android.hardware.biometrics.BiometricManager.Authenticators.DEVICE_CREDENTIAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.biometric.BiometricPrompt
import com.js.testproject.databinding.ActivityBiometricBinding
import com.orhanobut.logger.Logger
import java.util.concurrent.Executor

class BiometricActivity : AppCompatActivity() {

  lateinit var binding : ActivityBiometricBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityBiometricBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.biometric.setOnClickListener {


//      val keyguardManager = KeyguardManager()
//      if (keyguardManager.isDeviceSecure){
//        Logger.e("${keyguardManager.isDeviceSecure}")
//      }
      val promptInfo = BiometricPrompt.PromptInfo.Builder()
        .setTitle("Biometric login for my app")
        .setSubtitle("Log in using your biometric credential")
        .setAllowedAuthenticators(BIOMETRIC_STRONG or DEVICE_CREDENTIAL)
        .build()

      val authenticationCallback = getAuthenticationCallback()
      val biometricPrompt : BiometricPrompt = BiometricPrompt(this, Executor {  }, authenticationCallback)
      biometricPrompt.authenticate(promptInfo)


    }
  }

  fun getAuthenticationCallback() = object : BiometricPrompt.AuthenticationCallback() {
    override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
      super.onAuthenticationError(errorCode, errString)
      Toast.makeText(this@BiometricActivity,"생채 인식 에러",Toast.LENGTH_SHORT).show()
    }

    override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
      super.onAuthenticationSucceeded(result)
      Toast.makeText(this@BiometricActivity,"생채 인식 성공",Toast.LENGTH_SHORT).show()
    }

    override fun onAuthenticationFailed() {
      super.onAuthenticationFailed()
      Toast.makeText(this@BiometricActivity,"생채 인식 실패",Toast.LENGTH_SHORT).show()
    }
  }

}