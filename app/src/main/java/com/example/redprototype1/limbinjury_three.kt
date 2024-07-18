package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_limbinjury_three.*

class limbinjury_three : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_limbinjury_three)

        val getdata = intent
        val bodypain = getdata.getIntExtra("bodypain",0)

        li3_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_extremity::class.java))
        }

        li3_2.setOnClickListener {
            if(bodypain == 1){
                startActivity(Intent(this,uncomfortablefeeling::class.java).putExtra("frominjury",1))
            }else{
                startActivity(Intent(this,outsideactivity::class.java))
            }
        }
    }
}
