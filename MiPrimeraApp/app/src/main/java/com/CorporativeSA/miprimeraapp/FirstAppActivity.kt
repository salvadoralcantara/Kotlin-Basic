package com.CorporativeSA.miprimeraapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        val btnFirstApp = findViewById<AppCompatButton>(R.id.btnFirstApp)
        val etFirstApp = findViewById<AppCompatEditText>(R.id.etFirstApp)

        btnFirstApp.setOnClickListener{
            val name = etFirstApp.text.toString()

            if(!name.isEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("textName", name)
                startActivity(intent)
            }


        }
    }

    }
