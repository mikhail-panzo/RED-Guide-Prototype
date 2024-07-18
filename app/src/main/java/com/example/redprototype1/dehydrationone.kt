package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_dehydrationone.*

class dehydrationone : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dehydrationone)

        val getdata = intent
        val shock = getdata.getIntExtra("shock",0)

        dh1_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_dehydration::class.java))
        }

        dh1_2.setOnClickListener {
            startActivity(Intent(this,dehydrationtwo::class.java).putExtra("shock",shock))
        }

    }
}
