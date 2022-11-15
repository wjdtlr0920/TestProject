package com.js.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.js.fragmenttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    // MainFragment Add
    binding.btnAddMainFragment.setOnClickListener {
      val fragmentTransaction = supportFragmentManager.beginTransaction()
      fragmentTransaction.add(binding.mainContainer.id, MainFragment::class.java, null)
//      fragmentTransaction.addToBackStack(null)
      fragmentTransaction.commit()
    }
    // MainFragment Replace
    binding.btnReplaceMainFragment.setOnClickListener {
      val fragmentTransaction = supportFragmentManager.beginTransaction()
      fragmentTransaction.replace(binding.mainContainer.id, MainFragment::class.java, null)
//      fragmentTransaction.addToBackStack(null)
      fragmentTransaction.commit()
    }

    // SubFragment Add
    binding.btnAddSubFragment.setOnClickListener {
      val fragmentTransaction = supportFragmentManager.beginTransaction()
      fragmentTransaction.add(binding.mainContainer.id, SubFragment::class.java, null)
//      fragmentTransaction.addToBackStack(null)
      fragmentTransaction.commit()
    }
    // SubFragment Replace
    binding.btnReplaceSubFragment.setOnClickListener {
      val fragmentTransaction = supportFragmentManager.beginTransaction()
      fragmentTransaction.replace(binding.mainContainer.id, SubFragment::class.java, null)
//      fragmentTransaction.addToBackStack(null)
      fragmentTransaction.commit()
    }
  }
}