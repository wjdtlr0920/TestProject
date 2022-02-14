package com.js.testproject.permission

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.js.testproject.R
import com.js.testproject.databinding.ActivityPermissionBinding
import com.orhanobut.logger.Logger

class PermissionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPermissionBinding

    //    @RequiresApi(Build.VERSION_CODES.M)
//    @TargetApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_permission)

        binding.defaultPermission.setOnClickListener {

            // 권한 받았는지 확인1
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)

            // 권한 받았는지 확인2
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)

            // 권한 거절한적 있는지 확인
            // 권한 요청했을때 거절을 누르지 않았으면 true를 반환하지 않음
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)

            // 권한 요청
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), 4850)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
                shouldShowRequestPermissionRationale(Manifest.permission.READ_EXTERNAL_STORAGE)



            PackageManager.PERMISSION_DENIED
            PackageManager.PERMISSION_GRANTED
//            ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
//            checkPermission()
        }


        binding.callPermission.setOnClickListener {
            requestPermissions(arrayOf(Manifest.permission.CALL_PHONE), 4850)
            checkSelfPermission(Manifest.permission.CALL_PHONE)
        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        Log.d("onRequest", "onRequestPermissionsResult")
        Log.d("onRequest", "$requestCode")
        Log.d("onRequest", "$permissions")
        Log.d("onRequest", "$grantResults")

        startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:119")))


    }
}