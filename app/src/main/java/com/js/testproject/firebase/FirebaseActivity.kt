package com.js.testproject.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.js.testproject.R
import com.js.testproject.databinding.ActivityFirebaseBinding
import com.orhanobut.logger.Logger

class FirebaseActivity : AppCompatActivity() {

  lateinit var binding : ActivityFirebaseBinding

  private lateinit var googleSignInClient: GoogleSignInClient
  private lateinit var auth: FirebaseAuth

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityFirebaseBinding.inflate(layoutInflater)
    setContentView(binding.root)

    auth = Firebase.auth

    binding.firebaseAuth.setOnClickListener{

      googleLogin()

    }
  }



  /**
   * 구글 로그인
   * */
  private fun googleLogin(){
    val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
      .requestIdToken(getString(R.string.default_web_client_id))
      .requestEmail()
      .build()

    googleSignInClient = GoogleSignIn.getClient(this, gso)
    startActivityForResult(googleSignInClient.signInIntent, 3111)
//    googleLoginRegister.launch(signInIntent)

  }

  private val googleLoginRegister = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
    Logger.e("google login resultCode : " + it.resultCode)
    Logger.e("google login data : " + it.data.toString())
  }


  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    Logger.e("google login requestCode : " + requestCode)
    Logger.e("google login resultCode : " + resultCode)
    Logger.e("google login data : " + data.toString())


    if (requestCode == 3111) {
      val task = GoogleSignIn.getSignedInAccountFromIntent(data)
      var account: GoogleSignInAccount? = null
      try {
        account = task.getResult(ApiException::class.java)
        firebaseAuthWithGoogle(account!!.idToken)
      } catch (e: ApiException) {
        Toast.makeText(this, "Failed Google Login", Toast.LENGTH_SHORT).show()
      }
    }

  }

  private fun firebaseAuthWithGoogle(idToken: String?) {
    val credential = GoogleAuthProvider.getCredential(idToken, null)
    auth.signInWithCredential(credential)
      .addOnCompleteListener(this,
        OnCompleteListener<AuthResult?> { task ->
          if (task.isSuccessful) {
            // 인증에 성공한 후, 현재 로그인된 유저의 정보를 가져올 수 있습니다.
            val email = auth.currentUser?.email
            Logger.e(email!!)
          }
        })
  }

  override fun onStart() {
    super.onStart()


  }

}