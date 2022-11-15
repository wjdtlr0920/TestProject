package com.js.fragmenttest

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment: Fragment(R.layout.fragment_main) {

  private val TAG: String = this.javaClass.name

  override fun onAttach(context: Context) {
    super.onAttach(context)
    Log.d(TAG, "onAttach")
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Log.d(TAG, "onCreate")
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    Log.d(TAG, "onCreateView")
    return super.onCreateView(inflater, container, savedInstanceState)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    Log.d(TAG, "onViewCreated")
  }

  override fun onViewStateRestored(savedInstanceState: Bundle?) {
    super.onViewStateRestored(savedInstanceState)
    Log.d(TAG, "onViewStateRestored")
  }

  override fun onStart() {
    super.onStart()
    Log.d(TAG, "onStart")
  }

  override fun onResume() {
    super.onResume()
    Log.d(TAG, "onResume")
  }

  override fun onPause() {
    super.onPause()
    Log.d(TAG, "onPause")
  }

  override fun onStop() {
    super.onStop()
    Log.d(TAG, "onStop")
  }

  override fun onDestroyView() {
    super.onDestroyView()
    Log.d(TAG, "onDestroyView")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d(TAG, "onDestroy")
  }

}