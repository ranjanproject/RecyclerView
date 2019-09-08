package com.pratik.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val books = listOf<Book>(Book("Physics", "Pratik"),
        Book("Chemistry","Ranjan"),
        Book("Math","Pratik Ranjan"),
        Book("Bio", "Sabnam"),
        Book("Grass", "Bakri"),
        Book("BDS","Bakri"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MyAdapter(books)
        }
    }
}
