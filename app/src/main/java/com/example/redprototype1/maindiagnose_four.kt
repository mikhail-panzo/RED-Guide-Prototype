package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_maindiagnose_four.*

class maindiagnose_four : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maindiagnose_four)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        val shock = getdata.getIntExtra("shock",0)
        val heart = getdata.getIntExtra("heart",0)
        val set = getdata.getIntExtra("set",0)
        val lowpulse = getdata.getIntExtra("lowpulse",0)

        //button clicks
        md4_1.setOnClickListener {
            val intent = Intent(this,maindiagnose_five::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("heart",heart)
            intent.putExtra("set",set)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }

        md4_2.setOnClickListener {
            val intent = Intent(this,bodytempdiagnose::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("heart",heart)
            intent.putExtra("set",set)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }

    }
}
