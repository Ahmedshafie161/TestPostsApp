package com.example.postapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter (private var myList:ArrayList<PostItem>):
    RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {
    class MyViewHolder (val view : View) : RecyclerView.ViewHolder(view){
        val tvTitle: TextView = view.findViewById(R.id.textView)
        val tvBody: TextView = view.findViewById(R.id.textView2)
        fun addDataToView(post:PostItem){
            tvTitle.text= post.title
            tvBody.text= post.body
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.addDataToView(myList[position])
    }

    override fun getItemCount(): Int {
        return myList.size
    }
    fun updateList(myList:ArrayList<PostItem>){
        this.myList = myList
        notifyDataSetChanged()
    }
}