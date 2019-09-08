package com.pratik.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class MyViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_layout, parent, false)) {
    private var name: TextView? = null
    private var header: TextView? = null

    init{
        header = itemView.findViewById(R.id.header)
        name = itemView.findViewById(R.id.name)
        itemView.setOnClickListener ( object :View.OnClickListener {
            override fun onClick(p0: View?) {
                Toast.makeText(parent.context,header?.text.toString() + "",Toast.LENGTH_LONG).show()
            }

        })
    }

    fun bindView(book: Book){
         header?.text = book.header
         name?.text = book.name
    }
}