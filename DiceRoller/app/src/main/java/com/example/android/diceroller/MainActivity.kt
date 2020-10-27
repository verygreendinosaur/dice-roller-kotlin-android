package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

private const val ROLL_BUTTON_TEXT = "Let's Roll"
private const val TOAST_TEXT = "button clicked"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupButtons()
    }

    private fun setupButtons() {
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.text = ROLL_BUTTON_TEXT
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        var randomInt = Random().nextInt(6) + 1
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = randomInt.toString()
    }

}
