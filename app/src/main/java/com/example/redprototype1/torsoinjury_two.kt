package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_torsoinjury_two.*

class torsoinjury_two : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_torsoinjury_two)

        ti2_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_CaA::class.java))
        }

        ti2_2.setOnClickListener {
            startActivity(Intent(this,Diagnose_WaA::class.java))
        }
    }
}
