package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_dehydrationtwo.*

class dehydrationtwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dehydrationtwo)


        val getdata = intent
        val shock = getdata.getIntExtra("shock",0)

        dh2_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_dehydration::class.java))
        }

        dh2_2.setOnClickListener {
            startActivity(Intent(this,dehydrationthree::class.java).putExtra("shock",shock))
        }
    }
}
