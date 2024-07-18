package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_chestfollow.*

class chestfollow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chestfollow)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        var shock = getdata.getIntExtra("shock",0)
        var set = getdata.getIntExtra("set",0)

        cf1_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_CaA::class.java))
        }

        cf1_2.setOnClickListener {
            shock+=1
            set += 1
            val intent = Intent(this,maindiagnose_three::class.java)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("shock",shock)
            intent.putExtra("set",set)
            startActivity(intent)
        }
    }
}
