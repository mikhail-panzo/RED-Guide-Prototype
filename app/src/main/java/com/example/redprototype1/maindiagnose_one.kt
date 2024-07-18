package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_maindiagnose_one.*

class maindiagnose_one : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maindiagnose_one)

        //diagnosis evaluation data
        var dehydration = 0
        var shock = 0

        //button clicks
        md1_1.setOnClickListener {
            dehydration += 1
            val intent = Intent(this,maindiagnose_two::class.java)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("shock",shock)
            startActivity(intent)
        }

        md1_2.setOnClickListener {
            dehydration += 1
            shock += 1
            val intent = Intent(this,maindiagnose_two::class.java)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("shock",shock)
            startActivity(intent)
        }

        md1_3.setOnClickListener {
            startActivity(Intent(this, Diagnose_unconscious::class.java))
        }
    }
}
