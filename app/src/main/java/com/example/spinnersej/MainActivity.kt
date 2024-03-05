package com.example.spinnersej

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnllenar = findViewById<Button>(R.id.btnagregar)
        var spinner = findViewById<Spinner>(R.id.Spinners)
        var nombre = findViewById<EditText>(R.id.nombre)

        val arraySpinner = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item)
        arraySpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
       btnllenar.setOnClickListener {
           val texto = nombre.text.toString()
       }


    }

}