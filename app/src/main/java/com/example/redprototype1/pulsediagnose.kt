package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_pulsediagnose.*

class pulsediagnose : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pulsediagnose)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        var shock = getdata.getIntExtra("shock",0)
        val set = getdata.getIntExtra("set",0)

        //button clicks
        pd1_1.setOnClickListener {
            shock += 1
            val heart = 1
            val intent = Intent(this,maindiagnose_four::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("heart",heart)
            intent.putExtra("set",set)
            startActivity(intent)
        }

        pd1_2.setOnClickListener {
            val intent = Intent(this,possibleshockfive::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("set",set)
            startActivity(intent)
        }

        pd1_3.setOnClickListener {
            shock += 1
            val heart = 1
            val intent = Intent(this,maindiagnose_four::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("heart",heart)
            intent.putExtra("set",set)
            startActivity(intent)
        }
    }
}
