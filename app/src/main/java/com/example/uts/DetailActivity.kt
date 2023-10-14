package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val filmTitle = intent.getStringExtra("film_title")

        val filmImageView = findViewById<ImageView>(R.id.filmImageView)
        val filmTitleTextView = findViewById<TextView>(R.id.filmTitleTextView)
        val producerTextView = findViewById<TextView>(R.id.producerTextView)
        val filmRatingBar = findViewById<RatingBar>(R.id.filmRatingBar)
        val genreTextView = findViewById<TextView>(R.id.genreTextView)
        val synopsisTextView = findViewById<TextView>(R.id.synopsisTextView)
        val beliTiketButton = findViewById<Button>(R.id.beliTiketButton)

        filmTitleTextView.text = filmTitle
        producerTextView.text = "Produser Film 1"
        filmRatingBar.rating = 4.5f
        genreTextView.text = "Action, Drama"
        synopsisTextView.text = "Sinopsis Film 1"

        beliTiketButton.setOnClickListener {
            val intent = Intent(this, TicketActivity::class.java)
            intent.putExtra("film_title", filmTitle)
            startActivity(intent)
        }
    }
}
