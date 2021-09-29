package com.example.toasttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var txt1:EditText
    lateinit var txt2: EditText
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener {
            Toast.makeText(applicationContext,"${txt1.text} ${txt2.text}",Toast.LENGTH_SHORT).show()
        }
    }
}