package com.js.testproject.viewtest.textinputlayout.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.js.testproject.databinding.AdapterViewTestBinding

class ViewTestAdapter(val CTX : Context, val dataSet : ArrayList<Class<*>>) : RecyclerView.Adapter<ViewTestAdapter.ViewHolder>() {

    inner class ViewHolder(binding : AdapterViewTestBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = AdapterViewTestBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.binding.title.text = dataSet[position].simpleName

        holder.itemView.setOnClickListener {
            val intent = Intent(CTX, dataSet[position])
            CTX.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}