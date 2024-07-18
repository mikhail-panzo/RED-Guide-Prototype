package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_possibleshockfive.*
import kotlinx.android.synthetic.main.activity_possibleshocksix.*

class possibleshocksix : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_possibleshocksix)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        val shock = getdata.getIntExtra("shock",0)
        val set = getdata.getIntExtra("set",0)
        val anSuspect = getdata.getIntExtra("anSuspect",0)

        //button clicks
        ps6_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_shock_cardiogenic::class.java))
        }

        ps6_2.setOnClickListener {
            var intent = Intent(this, Diagnosis::class.java)

            if(anSuspect == 1){
                intent = Intent(this,injury_sus::class.java).putExtra("bodypain",1)
            }

            if(set != 0){
                intent = Intent(this, maindiagnose_four::class.java)
                intent.putExtra("lowpulse",1)
            }

            intent.putExtra("dehydration", dehydration)
            intent.putExtra("anSuspect", anSuspect)
            intent.putExtra("shock",shock)
            intent.putExtra("set",set)
            startActivity(intent)
        }
    }
}
