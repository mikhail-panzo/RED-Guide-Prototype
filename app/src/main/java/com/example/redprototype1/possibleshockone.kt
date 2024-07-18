package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_possibleshockone.*

class possibleshockone : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_possibleshockone)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        val anSuspect = getdata.getIntExtra("anSuspect",0)
        val lowpulse = getdata.getIntExtra("lowpulse",0)

        //button clicks
        ps1_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_shock_sepsis::class.java))
        }

        ps1_2.setOnClickListener {
            val intent = Intent(this,possibleshocktwo::class.java)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("anSuspect",anSuspect)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }
    }
}
