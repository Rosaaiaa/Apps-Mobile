package com.example.navegandoentretelas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView

class Activity3 : AppCompatActivity() {
    private lateinit var botao2: Button
    private lateinit var botao1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        // Configuração dos botões
        botao2 = findViewById(R.id.botao2)
        botao2.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

        botao1 = findViewById(R.id.botao1)
        botao1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Exibindo a lista de nomes
        val listaNomes = findViewById<TextView>(R.id.listaNomes)
        val participantes = listOf(
            "Joana Rosa",
            "Leonardo Souza",
            "Marcus Vinicius",
            "Renoir Bagi",
            "Sidinei Casaes"
        )
        listaNomes.text = participantes.joinToString("\n")


        val circleImageView: CircleImageView = findViewById(R.id.circleImageView)
        circleImageView.setImageResource(R.drawable.snoopy_peanuts)
    }
}

