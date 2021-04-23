package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var incrementButton : Button = findViewById(R.id.increment_button)
        var decrementButton : Button = findViewById(R.id.decrement_button)
        var textView : TextView  = findViewById(R.id.textView)

        incrementButton.setOnClickListener {
            var stringValue  = textView.text.toString()
            var originalValue = Integer.parseInt(stringValue)
            textView.text = Integer.toString(originalValue + 1)
        }

        decrementButton.setOnClickListener {
            var stringValue  = textView.text.toString()
            var originalValue = Integer.parseInt(stringValue)
            textView.text = Integer.toString(originalValue - 1)
        }

    }
}