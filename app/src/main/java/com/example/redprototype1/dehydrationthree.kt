package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_dehydrationthree.*

class dehydrationthree : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dehydrationthree)

        val getdata = intent
        val shock = getdata.getIntExtra("shock",0)

        dh3_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_dehydration::class.java))
        }

        dh3_2.setOnClickListener {
            startActivity(Intent(this,Diagnosis::class.java).putExtra("shock",shock))
        }

        dh3_3.setOnClickListener {
            startActivity(Intent(this,Diagnose_dehydration::class.java))
        }
    }
}
