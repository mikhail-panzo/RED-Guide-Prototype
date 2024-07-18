package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_injuryfollow_two.*

class injuryfollow_two : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injuryfollow_two)

        if2_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_shock_anaphylaxis::class.java))
        }

        if2_2.setOnClickListener {
            startActivity(Intent(this,injury_one::class.java).putExtra("bodypain",1))
        }

        if2_3.setOnClickListener {
            startActivity(Intent(this,generalshockone::class.java).putExtra("anSuspect",1))
        }
    }
}
