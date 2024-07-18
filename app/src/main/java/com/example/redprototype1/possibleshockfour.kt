package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_possibleshockfour.*

class possibleshockfour : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_possibleshockfour)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        val anSuspect = getdata.getIntExtra("anSuspect",0)
        val lowpulse = getdata.getIntExtra("lowpulse",0)

        //button clicks
        ps4_1.setOnClickListener {
           startActivity(Intent(this,Diagnose_shock_anaphylaxis::class.java))
        }

        ps4_2.setOnClickListener {
            var intent = Intent(this, possibleshockfive::class.java)
            if(lowpulse == 1){
                intent = Intent(this,Diagnosis::class.java)
            }
            intent.putExtra("dehydration", dehydration)
            intent.putExtra("anSuspect", anSuspect)
            startActivity(intent)
        }
    }
}
