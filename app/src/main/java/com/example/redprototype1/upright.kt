package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_upright.*

class upright : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upright)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        val anSuspect = getdata.getIntExtra("anSuspect",0)
        val lowpulse = getdata.getIntExtra("lowpulse",0)

        //button clicks
        up1_1.setOnClickListener {
            val intent = Intent(this,generalshocktwo::class.java)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("anSuspect",anSuspect)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }

        up1_2.setOnClickListener {
            val intent = Intent(this,possibleshockone::class.java)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("anSuspect",anSuspect)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }
    }
}
