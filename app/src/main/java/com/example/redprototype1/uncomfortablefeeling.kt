package com.example.redprototype1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_uncomfortablefeeling.*

class uncomfortablefeeling : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uncomfortablefeeling)

        //passed data
        val getdata = intent
        var dehydration = getdata.getIntExtra("dehydration",0)
        var shock = getdata.getIntExtra("shock",0)
        val frominjury = getdata.getIntExtra("frominjury",0)
        var set = 5

        if(frominjury == 1){
            set = 4
            findViewById<TextView>(R.id.textView5).text = "Which of these does he or she currently have?"
            findViewById<TextView>(R.id.textView6).text = "Select all that apply or leave blank"
        }

        //button clicks
        var b1 = 0
        uf1_1.setOnClickListener {
            if(b1==0){
                b1 = 1
                uf1_1.setTextColor(Color.parseColor("#FFFFFF"))
                uf1_1.setBackgroundColor(Color.parseColor("#FFC26E"))
                dehydration += 1
                shock += 1
                set += 1
            }else{
                b1 = 0
                uf1_1.setTextColor(Color.parseColor("#333333"))
                uf1_1.setBackgroundColor(Color.parseColor("#DDDDDD"))
                dehydration -= 1
                shock -= 1
                set -= 1
            }
        }

        var b2 = 0
        var b2fu = 0
        uf1_2.setOnClickListener {
            if(b2==0){
                b2 = 1
                b2fu = 1
                uf1_2.setTextColor(Color.parseColor("#FFFFFF"))
                uf1_2.setBackgroundColor(Color.parseColor("#FFC26E"))
            }else{
                b2 = 0
                b2fu = 0
                uf1_2.setTextColor(Color.parseColor("#333333"))
                uf1_2.setBackgroundColor(Color.parseColor("#DDDDDD"))
            }
        }

        var b3 = 0
        uf1_3.setOnClickListener {
            if(b3==0){
                b3 = 1
                uf1_3.setTextColor(Color.parseColor("#FFFFFF"))
                uf1_3.setBackgroundColor(Color.parseColor("#FFC26E"))
                dehydration += 1
                shock += 1
                set+= 1
            }else{
                b3 = 0
                uf1_3.setTextColor(Color.parseColor("#333333"))
                uf1_3.setBackgroundColor(Color.parseColor("#DDDDDD"))
                dehydration -= 1
                shock -= 1
                set-= 1
            }
        }

        var b4 = 0
        var b4fu = 0
        uf1_4.setOnClickListener {
            if(b4==0){
                b4 = 1
                b4fu = 1
                uf1_4.setTextColor(Color.parseColor("#FFFFFF"))
                uf1_4.setBackgroundColor(Color.parseColor("#FFC26E"))
            }else{
                b4 = 0
                b4fu = 0
                uf1_4.setTextColor(Color.parseColor("#333333"))
                uf1_4.setBackgroundColor(Color.parseColor("#DDDDDD"))
            }
        }

        var b5 = 0
        uf1_5.setOnClickListener {
            if(b5==0){
                b5 = 1
                uf1_5.setTextColor(Color.parseColor("#FFFFFF"))
                uf1_5.setBackgroundColor(Color.parseColor("#FFC26E"))
                shock += 1
                set += 1
            }else{
                b5 = 0
                uf1_5.setTextColor(Color.parseColor("#333333"))
                uf1_5.setBackgroundColor(Color.parseColor("#DDDDDD"))
                shock -= 1
                set -= 1
            }
        }

        var b6 = 0
        uf1_6.setOnClickListener {
            if(b6==0){
                b6 = 1
                uf1_6.setTextColor(Color.parseColor("#FFFFFF"))
                uf1_6.setBackgroundColor(Color.parseColor("#FFC26E"))
                dehydration += 1
                shock += 1
                set += 1
            }else{
                b6 = 0
                uf1_6.setTextColor(Color.parseColor("#333333"))
                uf1_6.setBackgroundColor(Color.parseColor("#DDDDDD"))
                dehydration -= 1
                shock -= 1
                set -= 1
            }
        }

        //confirm
        confirm.setOnClickListener {
            var intent = Intent(this,maindiagnose_three::class.java)

            if(b2fu==1){
                intent = Intent(this,stomachachefollow::class.java)
                if(b4fu==1){
                    intent.putExtra("chest",b4fu)
                }
            }else if(b4fu==1){
                intent = Intent(this,chestfollow::class.java)
            }

            intent.putExtra("dehydration",dehydration)
            intent.putExtra("shock",shock)
            intent.putExtra("set",set)
            startActivity(intent)
        }

    }
}
