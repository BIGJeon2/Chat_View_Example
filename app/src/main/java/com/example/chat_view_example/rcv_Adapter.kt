package com.example.chat_view_example

import android.app.Activity
import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class rcv_Adapter (val items: MutableList<RCV_Item>, val context: Context) : RecyclerView.Adapter<rcv_Adapter.ViewHolder> (){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.item_IMG)
        val name: TextView = view.findViewById(R.id.item_NAME)
        val last_chat: TextView = view.findViewById(R.id.item_LastChat)
        fun bind(item: RCV_Item){
            name.text = item.NAME
            last_chat.text = item.LastChat
            Glide.with(context).load(item.IMG).into(img)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rcv_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}