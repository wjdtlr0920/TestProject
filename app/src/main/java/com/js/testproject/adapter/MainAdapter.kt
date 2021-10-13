package com.js.testproject.adapter

import com.js.testproject.databinding.AdapterActivityOpenBinding
import java.util.*
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ActivityOpenAdapter(private val ctx : Context, private val dataSet: ArrayList<Class<*>>) :
    RecyclerView.Adapter<ActivityOpenAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: AdapterActivityOpenBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = AdapterActivityOpenBinding.inflate(LayoutInflater.from(parent.context), parent, false)

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