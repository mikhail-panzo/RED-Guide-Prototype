package com.example.redprototype1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Diagnosis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //passed data
        val getdata = intent
        val dehydration = getdata.getIntExtra("dehydration",0).toFloat()
        val shock = getdata.getIntExtra("shock",0).toFloat()
        val heart = getdata.getIntExtra("heart",0)
        val lowpulse = getdata.getIntExtra("lowpulse",0)
        val set = getdata.getIntExtra("set",11).toFloat()

        //calculation

        var shockvalue = ( shock / 11 )*( shock / set )
        var dehydrationvalue = ( dehydration / 4 )*( dehydration / set )

        if(shock == 0F){
            shockvalue = 0F
        }
        if(dehydration == 0F){
            dehydrationvalue = 0F
        }

        if(shockvalue - dehydrationvalue > 0){
            if(heart == 1 || lowpulse == 1 || dehydration == 0F){
                val dpass = dehydration.toInt()
                startActivity(Intent(this, generalshockone::class.java).putExtra("dehydration",dpass).putExtra("lowpulse",lowpulse))
            }else{
                val spass = shock.toInt()
                startActivity(Intent(this,dehydrationone::class.java).putExtra("shock",spass))
            }
        }else if(dehydrationvalue - shockvalue > 0){
            val spass = shock.toInt()
            startActivity(Intent(this,dehydrationone::class.java).putExtra("shock",spass))
        }else if(shockvalue + dehydrationvalue == 0F){
            startActivity(Intent(this, outsideactivity::class.java))
        }else{
            startActivity(Intent(this, generalshockone::class.java))
        }
    }
}