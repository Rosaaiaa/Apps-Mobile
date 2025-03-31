package com.example.navegandoentretelas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var botao2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        botao2 = findViewById(R.id.botao2)
        botao2.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)



        }
    }
}