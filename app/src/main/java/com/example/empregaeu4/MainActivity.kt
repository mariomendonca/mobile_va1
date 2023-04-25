package com.example.empregaeu4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Toast
import com.example.empregaeu4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loginButton = binding.idButton

        loginButton.setOnClickListener{
            val intent = Intent(this,segunda_tela::class.java)
            startActivity(intent)
        }

        val registerButton = binding.idcadastro

        registerButton.setOnClickListener{
            val intent = Intent(this,terceira_tela::class.java)
            startActivity(intent)
        }
    }
}