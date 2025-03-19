package com.CorporativeSA.miprimeraapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.CorporativeSA.miprimeraapp.imcCalculator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        var btnSaludo = findViewById<AppCompatButton>(R.id.btnSaludo)
        var btnImcApp = findViewById<AppCompatButton>(R.id.btnImcApp)
        btnSaludo.setOnClickListener { navigeteToSaludoActivity() }
        btnImcApp.setOnClickListener{navigateToImcApp()}
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigeteToSaludoActivity() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}