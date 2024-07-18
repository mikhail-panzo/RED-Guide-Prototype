package com.example.redprototype1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_stomachachefollow.*

class stomachachefollow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stomachachefollow)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0)
        val shock = getdata.getIntExtra("shock",0)
        val chest = getdata.getIntExtra("chest",0)
        var set = getdata.getIntExtra("set",0)

        //button clicks
        sf1_1.setOnClickListener {
            val intent = Intent(this,stomachachefollow_two::class.java)
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("shock",shock)
            intent.putExtra("chest",chest)
            intent.putExtra("set",set)
            startActivity(intent)
        }

        sf1_2.setOnClickListener {
            var intent = Intent(this,maindiagnose_three::class.java)
            set += 1
            if(chest==1){
                intent = Intent(this,chestfollow::class.java)
            }
            intent.putExtra("dehydration",dehydration)
            intent.putExtra("shock",shock)
            intent.putExtra("chest",chest)
            intent.putExtra("set",set)
            startActivity(intent)
        }

    }
}
