package com.example.uts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TicketActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket)

        val datePicker = findViewById<DatePicker>(R.id.datePicker)
        val selectedInfoTextView = findViewById<TextView>(R.id.selectedInfoTextView)

        val filmTitle = intent.getStringExtra("film_title")
        selectedInfoTextView.text = "Film: $filmTitle"

        val orderSummaryButton = findViewById<Button>(R.id.orderSummaryButton)
        orderSummaryButton.setOnClickListener {
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }

        datePicker.init(
            datePicker.year, datePicker.month, datePicker.dayOfMonth
        ) { view, year, monthOfYear, dayOfMonth ->
        }
    }
}


