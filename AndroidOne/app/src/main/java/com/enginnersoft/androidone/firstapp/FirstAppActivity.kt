package com.enginnersoft.androidone.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.enginnersoft.androidone.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        // Al arrancar la pantalla
        val btnClick = findViewById<AppCompatButton>(R.id.btnClick)
        val editName = findViewById<AppCompatEditText>(R.id.EditName)
        btnClick.setOnClickListener{
            val name = editName.text.toString()
            if (name.isNotEmpty()){
                Log.i("MonsalveDev", "onCreate: button Pulsado $name" )
            }

        }
   }
}