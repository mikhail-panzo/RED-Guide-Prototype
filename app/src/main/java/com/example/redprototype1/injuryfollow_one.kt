package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_injuryfollow_one.*

class injuryfollow_one : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injuryfollow_one)

        //get data
        val getdata = intent
        val injury = getdata.getIntExtra("injury",0)

        if1_1.setOnClickListener {
            startActivity(Intent(this,generalshockone::class.java).putExtra("anSuspect",1))
        }
        if1_2.setOnClickListener {
            if(injury == 1){
                startActivity(Intent(this,injury_one::class.java))
            }else{
                startActivity(Intent(this,injuryfollow_two::class.java))
            }
        }

    }
}
