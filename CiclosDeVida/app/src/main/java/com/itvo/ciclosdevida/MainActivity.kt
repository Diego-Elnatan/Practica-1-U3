package com.itvo.ciclosdevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txvMusica: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txvMusica = findViewById(R.id.txv_estatus_Musica)
        txvMusica.text = "REPRODUNCIENDO MUSICA"

        Log.i("RegistrosDe Mi App", "Estamos en oncreate")
    }

    override fun onStart() {
        super.onStart()


        Log.i("RegistrosDe Mi App", "Estamos en onStar")

    }

    override fun onResume() {
        super.onResume()
        Log.i("RegistrosDe Mi App", "Estamos en onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.i("RegistrosDe Mi App", "Estamos en onPause")

    }

    override fun onStop() {
        super.onStop()

        txvMusica.text = "MUSICA PAUSADA"
        Log.i("RegistrosDe Mi App", "Estamos en onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("RegistrosDe Mi App", "Estamos en onDestroy")

    }
}