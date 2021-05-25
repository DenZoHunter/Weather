package ru.geekbrains.weather

import android.os.Bundle
import android.util.Log
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


        val buttonCycle : Button = findViewById(R.id.click_cycle)

        buttonCycle.setOnClickListener {
            testCycle()
        }

    }

    private fun testCycle() {
        for (i in 1..5) {
            Log.i("Number of cycle: ",i.toString())
        }
/*        2021-05-22 15:53:57.619 12378-12378/ru.geekbrains.weather I/Number of cycle:: 1
        2021-05-22 15:53:57.619 12378-12378/ru.geekbrains.weather I/Number of cycle:: 2
        2021-05-22 15:53:57.619 12378-12378/ru.geekbrains.weather I/Number of cycle:: 3
        2021-05-22 15:53:57.620 12378-12378/ru.geekbrains.weather I/Number of cycle:: 4
        2021-05-22 15:53:57.620 12378-12378/ru.geekbrains.weather I/Number of cycle:: 5*/
    }
}