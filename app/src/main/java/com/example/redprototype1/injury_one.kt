package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_injury_one.*

class injury_one : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injury_one)

        //passed data
        val getdata = intent
        val bodypain = getdata.getIntExtra("bodypain",0)

        inj1_1.setOnClickListener {
            startActivity(Intent(this,limbinjury_one::class.java).putExtra("bodypain",bodypain))
        }
        inj1_2.setOnClickListener {
            startActivity(Intent(this,torsoinjury_one::class.java).putExtra("bodypain",bodypain))
        }
    }
}
