package com.shrishtionline.recyclerviewwithkotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class RecyclerViewAdapter(private var context: Context,private var dataList:ArrayList<String>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return dataList.size;
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item_view, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //Set up textview with data

        holder.textView.text=dataList.get(position);
    }


    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var textView:TextView =itemView!!.findViewById(R.id.text_view)
    }
}