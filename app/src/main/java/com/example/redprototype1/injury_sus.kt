package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_injury_sus.*

class injury_sus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_injury_sus)

        is1_1.setOnClickListener {
            startActivity(Intent(this,uncomfortablefeeling::class.java).putExtra("frominjury",1))
        }

        is1_2.setOnClickListener {
            startActivity(Intent(this,outsideactivity::class.java))
        }
    }
}
