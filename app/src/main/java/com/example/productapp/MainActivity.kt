package com.example.productapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Course: MAD302
 * Assignment: 2
 * Name: Ishmeet Singh
 * Student ID: A00202436
 * Description: Displays list of products using RecyclerView.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Product list (at least 6)
        val products = listOf(
            Product("Phone", 500.0, "Android smartphone"),
            Product("Laptop", 1200.0, "Gaming laptop"),
            Product("TV", 800.0, "Smart TV"),
            Product("Shoes", 100.0, "Running shoes"),
            Product("Watch", 200.0, "Smart watch"),
            Product("Tablet", 300.0, "Android tablet")
        )

        val adapter = ProductAdapter(products) { product ->

            // Intent navigation
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", product.name)
            intent.putExtra("price", product.price)
            intent.putExtra("description", product.description)

            startActivity(intent)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}