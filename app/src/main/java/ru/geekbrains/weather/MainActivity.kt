package ru.geekbrains.weather

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.click_btn)

        button.setOnClickListener {
            Toast.makeText(applicationContext, "Click!", Toast.LENGTH_SHORT).show()
        }
    }
}