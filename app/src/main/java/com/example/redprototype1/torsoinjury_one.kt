package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_torsoinjury_one.*

class torsoinjury_one : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torsoinjury_one)

        val getdata = intent
        val bodypain = getdata.getIntExtra("bodypain",0)

        ti1_1.setOnClickListener {
            startActivity(Intent(this,torsoinjury_two::class.java))
        }

        ti1_2.setOnClickListener {
            startActivity(Intent(this,torsoinjury_no::class.java).putExtra("bodypain",bodypain))
        }
    }
}
