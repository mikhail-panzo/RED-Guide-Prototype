package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_maindiagnose_three.*

class maindiagnose_three : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maindiagnose_three)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        val shock = getdata.getIntExtra("shock",0)
        val set = getdata.getIntExtra("set",0)

        //button clicks
        md3_1.setOnClickListener {
            val intent = Intent(this,maindiagnose_four::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("set",set)
            startActivity(intent)
        }

        md3_2.setOnClickListener {
            val intent = Intent(this,pulsediagnose::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("set",set)
            startActivity(intent)
        }
    }
}
