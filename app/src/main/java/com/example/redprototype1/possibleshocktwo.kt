package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_possibleshocktwo.*

class possibleshocktwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_possibleshocktwo)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        val anSuspect = getdata.getIntExtra("anSuspect",0)
        val lowpulse = getdata.getIntExtra("lowpulse",0)

        //button clicks
        ps2_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_shock_sepsis::class.java))
        }

        ps2_2.setOnClickListener {
            val intent = Intent(this,possibleshockthree::class.java)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("anSuspect",anSuspect)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }
    }
}
