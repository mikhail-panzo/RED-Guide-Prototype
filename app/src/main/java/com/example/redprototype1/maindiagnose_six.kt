package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_maindiagnose_six.*

class maindiagnose_six : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maindiagnose_six)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        var shock = getdata.getIntExtra("shock",0)
        val heart = getdata.getIntExtra("heart",0)
        val set = getdata.getIntExtra("set",0)
        val lowpulse = getdata.getIntExtra("lowpulse",0)

        md6_1.setOnClickListener {
            val intent = Intent(this,Diagnosis::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("heart",heart)
            intent.putExtra("set",set)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }

        md6_2.setOnClickListener {
            shock += 1
            val intent = Intent(this,Diagnosis::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("heart",heart)
            intent.putExtra("set",set)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }
    }
}
