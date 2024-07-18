package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_limbinjury_two.*

class limbinjury_two : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_limbinjury_two)

        li2_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_extremity::class.java))
        }

        li2_2.setOnClickListener {
            startActivity(Intent(this,limbinjury_three::class.java))
        }
    }
}
