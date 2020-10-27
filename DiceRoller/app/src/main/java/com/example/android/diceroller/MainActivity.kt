package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private const val ROLL_BUTTON_TEXT = "Let's Roll"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupButtons()
    }

    private fun setupButtons() {
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = ROLL_BUTTON_TEXT
    }

}
