package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_stomachachefollow_two.*

class stomachachefollow_two : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stomachachefollow_two)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        var shock = getdata.getIntExtra("shock",0)
        val chest = getdata.getIntExtra("chest",0)
        var set = getdata.getIntExtra("set",0)

        sf2_1.setOnClickListener {
            startActivity(Intent(this,Diagnose_dehydration_caton::class.java))
        }

        sf2_2.setOnClickListener {
            shock += 1
            set += 1
            var intent = Intent(this,maindiagnose_three::class.java)
            if(chest==1){
                intent = Intent(this,chestfollow::class.java)
            }
            intent.putExtra("shock",shock)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("set",set)
            startActivity(intent)
        }

    }
}
