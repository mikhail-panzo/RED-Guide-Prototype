package com.example.redprototype1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_diagnose_shock.*

class Diagnose_shock : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnose_shock)

        findViewById<TextView>(R.id.shock).text =
            "• For a person experiencing or threatened by shock, body temperature should " +
                    "be maintained by preventing heat loss.\n\n" +
                    "• First aid providers should place the person in shock in the supine (lying on " +
                    "back) position.\n\n" +
                    "• First aid providers should position the person who is unresponsive and " +
                    "breathing normally on his or her side while ensuring that his or her airway is " +
                    "open (recovery position).\n\n" +
                    "• First aid providers may raise the non-injured person’s legs 30 degrees to 60 " +
                    "degrees (PLR) if it makes him or her feel better; this may improve the vital " +
                    "signs for a few minutes.\n\n" +
                    "• First aid providers should activate EMS if the person seems to be threatened " +
                    "by shock or shows signs and symptom of shock. (Good Practice Point)\n\n" +
                    "• For people in shock caused by known heart infarction, different positioning " +
                    "(like supine position with slight elevation of the upper body) should be considered.\n\n" +
                    "• If the person is having breathing difficulties and will not tolerate being " +
                    "supine, first aid providers may help the person to get in a position being most " +
                    "tolerable or comfortable for him or her (usually semi-sitting or sitting position " +
                    "leaning forward)."

        findViewById<TextView>(R.id.possible).text =
            "Sepsis\nAnaphylaxis\nCardiogenic shock"

        button.setOnClickListener {
            startActivity(Intent(this,maindiagnose_one::class.java))
        }
    }
}
