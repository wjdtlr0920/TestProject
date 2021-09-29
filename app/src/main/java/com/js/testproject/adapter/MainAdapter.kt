package com.js.testproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.js.testproject.databinding.AdapterMainBinding

class MainAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<MainAdapter.MainHolder>() {

    inner class MainHolder(binding: AdapterMainBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val view = AdapterMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MainHolder(view)
    }

    override fun onBindViewHolder(mainHolder: MainHolder, position: Int) {

        mainHolder.binding.title.text = dataSet[position]
    }

    override fun getItemCount() = dataSet.size

}