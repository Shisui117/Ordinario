package com.ucol.ordinario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BotonUno.setOnClickListener{startActivity(Intent(this, Bitcoin::class.java))}
        BotonDos.setOnClickListener{startActivity(Intent(this, Dogecoin::class.java))}
        BotonTres.setOnClickListener{startActivity(Intent(this, Ethereum::class.java))}
        BotonCuatro.setOnClickListener{startActivity(Intent(this, Cardano::class.java))}
        BotonCinco.setOnClickListener{startActivity(Intent(this, Litecoin::class.java))}
        BotonSeis.setOnClickListener{startActivity(Intent(this, Binance::class.java))}
        BotonSiete.setOnClickListener{startActivity(Intent(this, Polkadot::class.java))}
        BotonOcho.setOnClickListener{startActivity(Intent(this, Ripple::class.java))}
        BotonNueve.setOnClickListener{startActivity(Intent(this, Bitbay::class.java))}
        BotonDiez.setOnClickListener{startActivity(Intent(this, Stellar::class.java))}
    }
}