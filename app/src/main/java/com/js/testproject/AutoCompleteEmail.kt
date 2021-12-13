package com.js.testproject


/**
 * FileSendTypeInfoActivity AppCompatAutoCompleteTextView에 사용될 데이터 클래스
 * */
data class AutoCompleteEmail(
  val email : String,                 // 보냈던 이메일
  val sendTimeMillis : String         // 보낸 날짜
)