package com.example.spinnersej

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.buttonSalir)
        val textProgram =  findViewById<TextView>(R.id.textProgram)
        val dato = intent.extras
        dato?.let {
            if (!dato.isEmpty){
                textProgram.text= dato.getString("itemDatos")
            }else{
                textProgram.text="No hay nah nada"
            }
        }

        button.setOnClickListener {
            finish()
        }
    }

}