package com.example.spinnersej

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
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
        var nombre = findViewById<EditText>(R.id.nombre)
        var spinner = findViewById<Spinner>(R.id.Spinners)
        var itemlenguajes = mutableListOf<String>("Selecionar")

        var arraySpinner = ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,itemlenguajes)
        spinner.adapter = arraySpinner


           btnllenar.setOnClickListener {
               var texto = nombre.text.toString().trim()
               if(texto.isNotEmpty()){
                   itemlenguajes.add(texto)
                   nombre.text.clear()

               }else{
                   nombre.text.clear()
               }

           }

        //if (True){
            spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ){
                    var itemSelected = arraySpinner.getItem(position).toString()
                    if(itemSelected.isNotEmpty() and (itemSelected != "Selecionar")){
                        mostrarSegundaPantalla(itemSelected)
                    }

                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }
       // }c#
    }
    private fun mostrarSegundaPantalla(valor: String) {
        val accion = Intent (this,MainActivity2::class.java)
        accion.putExtra("itemDatos", valor )
        startActivity(accion)
    }

}