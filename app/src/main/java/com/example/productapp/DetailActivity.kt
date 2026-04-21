package com.example.productapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Course: MAD302
 * Assignment: 2
 * Name: Ishmeet Singh
 * Student ID: A00202436
 * Description: Displays selected product details.
 */
class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name") ?: "No Name"       // Null safety applied
        val price = intent.getDoubleExtra("price", 0.0)
        val description = intent.getStringExtra("description") ?: "No Description"

        findViewById<TextView>(R.id.tvName).text = name
        findViewById<TextView>(R.id.tvPrice).text = "$$price"
        findViewById<TextView>(R.id.tvDescription).text = description
    }
}