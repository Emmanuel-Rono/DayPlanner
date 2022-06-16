package com.example.dayplanner

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class myAdapter(var data: Array<String):RecyclerView.Adapter<myAdapter.MyViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return data.size
    }
    class MyViewHolder: RecyclerView.ViewHolder()
    {

    }
}


