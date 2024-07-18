package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_limbinjury_one.*

class limbinjury_one : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_limbinjury_one)

        val getdata = intent
        val bodypain = getdata.getIntExtra("bodypain",0)

        li1_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_WaA::class.java))
        }

        li1_2.setOnClickListener {
            if(bodypain == 1){
                startActivity(Intent(this,limbinjury_three::class.java).putExtra("bodypain",bodypain))
             }else{
                startActivity(Intent(this,limbinjury_two::class.java))
            }
        }
    }
}
