package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bodytempdiagnose.*

class bodytempdiagnose : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bodytempdiagnose)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        var shock = getdata.getIntExtra("shock",0)
        val heart = getdata.getIntExtra("heart",0)
        val set = getdata.getIntExtra("set",0)
        val lowpulse = getdata.getIntExtra("lowpulse",0)

        //button clicks
        btd1_1.setOnClickListener {
            shock += 1
            val intent = Intent(this, maindiagnose_five::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("heart",heart)
            intent.putExtra("set",set)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }

        btd1_2.setOnClickListener {
            val intent = Intent(this, maindiagnose_five::class.java)
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("heart",heart)
            intent.putExtra("set",set)
            intent.putExtra("lowpulse",lowpulse)
            startActivity(intent)
        }
    }
}
