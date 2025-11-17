package com.example.jesus

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val flashcardQuestion = findViewById<TextView>(R.id.question)
        val flashcardtext1 = findViewById<TextView>(R.id.text1)
        val flashcardtext2 = findViewById<TextView>(R.id.text2)
        val flashcardtext3 = findViewById<TextView>(R.id.text3)

        flashcardQuestion.setOnClickListener {
            flashcardtext1.visibility = View.VISIBLE
            flashcardtext2.visibility = View.VISIBLE
            flashcardtext3.visibility = View.VISIBLE
        }

        flashcardtext1.setOnClickListener {
            findViewById<View>(R.id.text1).setBackgroundColor(getResources().getColor(R.color.Red, null))
            findViewById<View>(R.id.text2).setBackgroundColor(getResources().getColor(R.color.Pink, null))
            findViewById<View>(R.id.text3).setBackgroundColor(getResources().getColor(R.color.Green, null))
        }
        flashcardtext2.setOnClickListener {
            findViewById<View>(R.id.text2).setBackgroundColor(getResources().getColor(R.color.Red, null))
            findViewById<View>(R.id.text1).setBackgroundColor(getResources().getColor(R.color.Pink, null))
            findViewById<View>(R.id.text3).setBackgroundColor(getResources().getColor(R.color.Green, null))
        }
        flashcardtext3.setOnClickListener {
            findViewById<View>(R.id.text3).setBackgroundColor(getResources().getColor(R.color.Green, null))
            findViewById<View>(R.id.text1).setBackgroundColor(getResources().getColor(R.color.Pink, null))
            findViewById<View>(R.id.text2).setBackgroundColor(getResources().getColor(R.color.Pink, null))
        }
    }
}