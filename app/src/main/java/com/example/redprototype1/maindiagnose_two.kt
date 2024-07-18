package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_maindiagnose_two.*

class maindiagnose_two : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maindiagnose_two)

        //passed data
        val getdata = intent
        var dehydration = getdata.getIntExtra("dehydration",0)
        var shock = getdata.getIntExtra("shock",0)

        //debugging code
        val dehydrationcheck = dehydration.toString()
        val shockcheck = shock.toString()

        //button clicks
        md2_1.setOnClickListener {
            val injury = 1
            val intent = Intent(this,injuryfollow_one::class.java)
            intent.putExtra("injury",injury)
            startActivity(intent)
        }

        md2_2.setOnClickListener {
            startActivity(Intent(this,injuryfollow_one::class.java))
        }

        md2_3.setOnClickListener {
            val intent = Intent(this,uncomfortablefeeling::class.java)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("shock",shock)
            startActivity(intent)
        }
    }
}
