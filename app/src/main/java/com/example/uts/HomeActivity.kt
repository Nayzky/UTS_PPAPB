package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val film1Layout = findViewById<LinearLayout>(R.id.film1Layout1)
        val film2Layout = findViewById<LinearLayout>(R.id.film1Layout2)

        film1Layout.setOnClickListener {
            openDetailPage("Film 1")
        }

        film2Layout.setOnClickListener {
            openDetailPage("Film 2")
        }
    }

    private fun openDetailPage(filmTitle: String) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("film_title", filmTitle)
        startActivity(intent)
    }
}
