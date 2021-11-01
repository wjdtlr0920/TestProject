package com.js.testproject.mediastore

import android.Manifest
import android.content.ContentUris
import android.database.Cursor
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.text.format.DateFormat.format
import com.js.testproject.databinding.ActivityMediaStoreBinding
import java.text.DateFormat
import java.util.*

class MediaStoreActivity : AppCompatActivity() {

  lateinit var binding: ActivityMediaStoreBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMediaStoreBinding.inflate(layoutInflater)
    setContentView(binding.root)

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
      requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), 4850)
    }

    binding.MediaStore.setOnClickListener {
      initView()
    }
  }


  // 컨텐츠 리졸버, 사용해서 이미지 가져오기
  private fun getImages(): Cursor {

    var queryUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI

    // 가져올 칼럼명
    val what = arrayOf(
      MediaStore.Images.ImageColumns._ID,
      MediaStore.Images.ImageColumns.TITLE,
      MediaStore.Images.ImageColumns.DATE_TAKEN
    )

    // 정렬
    val orderBy = MediaStore.Images.ImageColumns.DATE_TAKEN + " DESC"

    // 1건만 가져오기
//    queryUri = queryUri.buildUpon().appendQueryParameter("limit","1").build()

    return contentResolver.query(queryUri, what, null, null, orderBy)!!
  }

  private fun initView(){

    val cursor = getImages()
    if (cursor.moveToFirst()){
      // 1. 각 컬럼의 열 인덱스를 취득한다.
      val idColNum = cursor.getColumnIndexOrThrow(MediaStore.Images.ImageColumns._ID)
      val titleColNum = cursor.getColumnIndexOrThrow(MediaStore.Images.ImageColumns.TITLE)
      val dateTakenColNum = cursor.getColumnIndexOrThrow(MediaStore.Images.ImageColumns.DATE_TAKEN)

      // 2. 인덱스를 바탕으로 데이터를 Cursor로부터 취득하기
      val id = cursor.getLong(idColNum)
      val title = cursor.getString(titleColNum)
      val dateTaken = cursor.getLong(dateTakenColNum)
      val imageUri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id)

      // 3. 데이터를 View로 설정
      val calendar = Calendar.getInstance()
      calendar.timeInMillis = dateTaken
//      val text = DateFormat.format("yyyy/MM/dd", calendar).toStirng()

      binding.imageView.setImageURI(imageUri)

    }
  }

}