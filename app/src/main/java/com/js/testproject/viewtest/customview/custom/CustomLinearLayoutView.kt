package com.js.testproject.viewtest.customview.custom

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.js.testproject.R
import com.js.testproject.databinding.CustomLinearLayoutViewBinding

class CustomLinearLayoutView @JvmOverloads constructor(
  context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

  var binding : CustomLinearLayoutViewBinding = CustomLinearLayoutViewBinding.inflate(LayoutInflater.from(context), this, false)

  init {

    addView(binding.root)
    getAttrs(attrs)

  }

  private fun getAttrs(attrs:AttributeSet?){
    //아까 만들어뒀던 속성 attrs 를 참조함
    val typedArray = context.obtainStyledAttributes(attrs,R.styleable.CustomAttrs)
    setTypeArray(typedArray)
  }


  private fun getAttrs(attrs:AttributeSet?, defStyle:Int){
    val typedArray = context.obtainStyledAttributes(attrs,R.styleable.CustomAttrs,defStyle,0)
    setTypeArray(typedArray)
  }

  //디폴트 설정
  private fun setTypeArray(typedArray : TypedArray){
//    //레이아웃의 배경, LoginButton 이름으로 만든 attrs.xml 속성중 bgColor 를 참조함
//    val bgResId = typedArray.getResourceId(R.styleable.CustomAttrs_bgColor,R.drawable.ic_launcher_background)
//    linearLayout.setBackgroundResource(bgResId)
//
//    //이미지의 배경, LoginButton 이름으로 만든 attrs.xml 속성중 imgColor 를 참조함
//    val imgResId = typedArray.getResourceId(R.styleable.CustomAttrs_imgColor,R.drawable.ic_launcher_foreground)
//    imageView.setBackgroundResource(imgResId)
//
//    //텍스트 색, LoginButton 이름으로 만든 attrs.xml 속성중 textColor 를 참조함
//    val textColor = typedArray.getColor(R.styleable.CustomAttrs_textColor,0)
//    textView.setTextColor(textColor)

    //이미지 추가


    //텍스트 내용, LoginButton 이름으로 만든 attrs.xml 속성중 text 를 참조함
    val text = typedArray.getText(R.styleable.CustomAttrs_text)
    binding.textView.text = text

    typedArray.recycle()
  }
}