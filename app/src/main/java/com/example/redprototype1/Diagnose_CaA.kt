package com.example.redprototype1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_diagnose__ca.*

class Diagnose_CaA : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnose__ca)


        findViewById<TextView>(R.id.caa).text =
            "• For open chest wounds, first aid providers may leave the wound free without " +
                    "applying a dressing.\n\n" +
                    "• If a wound dressing is necessary, non-occlusive wound dressings could be " +
                    "used (that is, one that does not seal the wound).\n\n" +
                    "• For chest and abdomen injuries, first aid providers should manage shock and " +
                    "place the person in a comfortable position.\n\n" +
                    "• For open abdominal wounds, first aid providers may place a sterile dressing\n" +
                    "on the wound.\n\n" +
                    "• First aid providers should not push back viscera (internal organs).\n\n" +
                    "• First aid providers should stabilize impaled objects.\n\n" +
                    "• If there is significant external bleeding, direct pressure to the chest wound\n\n" +
                    "with a hand and/or a dressing should be applied. Care must be taken that it" +
                    "does not become occlusive."

        button.setOnClickListener {
            startActivity(Intent(this,maindiagnose_one::class.java))
        }
    }
}
