package ru.geekbrains.weather

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val testNote = Note("Заголовок 1 ","Заметка 1")

    val copyNote = testNote.copy( note = "Заметка2")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.click_btn)

        button.setOnClickListener {
            Toast.makeText(applicationContext, "Click!", Toast.LENGTH_SHORT).show()
        }

        val buttonData: Button = findViewById(R.id.click_data)

        buttonData.setOnClickListener {
            Toast.makeText(this,"Data class: $testNote", Toast.LENGTH_SHORT).show()
        }

        val buttonCopy: Button = findViewById(R.id.click_data_copy)

        buttonCopy.setOnClickListener {
            Toast.makeText(this,"Data copy: $copyNote", Toast.LENGTH_SHORT).show()
        }



    }
}