package com.js.testproject.main.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.js.testproject.databinding.AdapterMainBinding

class MainAdapter(private val ctx : Context, private val dataSet: ArrayList<Class<*>>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    inner class ViewHolder(binding: AdapterMainBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = AdapterMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(mainHolder: ViewHolder, position: Int) {

        mainHolder.binding.title.text = dataSet[position].simpleName

        mainHolder.itemView.setOnClickListener {
            val intent = Intent(ctx, dataSet[position])
            ctx.startActivity(intent)
        }

    }

    override fun getItemCount() = dataSet.size
}