package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_torsoinjury_no.*

class torsoinjury_no : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torsoinjury_no)

        //passed data
        val getdata = intent
        val bodypain = getdata.getIntExtra("bodypain",0)

        tn1_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_CaA::class.java))
        }

        tn1_2.setOnClickListener {
            if(bodypain == 1){
                startActivity(Intent(this,uncomfortablefeeling::class.java).putExtra("frominjury",1))
            }else{
                startActivity(Intent(this,outsideactivity::class.java))
            }
        }
    }
}
