package com.example.carrocompras_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ingrese = findViewById<ImageButton>(R.id.drone)
        ingrese.setOnClickListener {
            val ingrese = Intent(this, CarroComprasActivity::class.java)
            startActivity(ingrese)
        }
        val trafere = findViewById<ImageButton>(R.id.computadora)
        trafere.setOnClickListener {
            val trafere = Intent(this, CarroComprasActivity::class.java)
            startActivity(trafere)
        }

        val ff = findViewById<ImageButton>(R.id.audifonos)
        ff.setOnClickListener {
            val ff = Intent(this, CarroComprasActivity::class.java)
            startActivity(ff)
        }
        val rr = findViewById<ImageButton>(R.id.vr)
        rr.setOnClickListener {
            val rr = Intent(this, CarroComprasActivity::class.java)
            startActivity(rr)
        }
        val ss = findViewById<Button>(R.id.carrito)
        ss.setOnClickListener {
            val ss = Intent(this, CarroComprasActivity::class.java)
            startActivity(ss)
        }
    }
}