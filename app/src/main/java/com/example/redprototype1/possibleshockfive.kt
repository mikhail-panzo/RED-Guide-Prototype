package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_possibleshockfive.*

class possibleshockfive : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_possibleshockfive)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        val shock = getdata.getIntExtra("shock",0)
        val set = getdata.getIntExtra("set",0)
        val anSuspect = getdata.getIntExtra("anSuspect",0)

        //button clicks
        ps5_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_shock_cardiogenic::class.java))
        }

        ps5_2.setOnClickListener {
            val intent = Intent(this, possibleshocksix::class.java)
            intent.putExtra("dehydration", dehydration)
            intent.putExtra("anSuspect", anSuspect)
            intent.putExtra("shock",shock)
            intent.putExtra("set",set)
            startActivity(intent)
        }
    }
}
