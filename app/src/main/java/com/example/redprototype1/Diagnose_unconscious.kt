package com.example.redprototype1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_diagnose_unconscious.*

class Diagnose_unconscious : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnose_unconscious)

        Toast.makeText(this,"Some of the possible illnesses have first aid information. Press an illness to check its first aid.",Toast.LENGTH_LONG).show()

        findViewById<TextView>(R.id.unresponsive).text =
            "• If the person is unconscious, first aid providers should initially ensure a patent " +
                    "airway and determine if normal breathing is present.\n\n" +
                    "• First aid providers should start CPR if needed. Be aware that sometimes a " +
                    "person in cardiac arrest may initially present a short seizure-like activity.\n\n" +
                    "• Consider other causes such as poisoning, diabetic emergency, hypoglycaemia, " +
                    "head injury etc.\n\n" +
                    "• First aid provider should put the person in recovery position and call for " +
                    "EMS.\n\n"

        findViewById<TextView>(R.id.possible).text =
            "Shock"

        possible.setOnClickListener {
            startActivity(Intent(this,Diagnose_shock::class.java))
        }
        button.setOnClickListener {
            startActivity(Intent(this,maindiagnose_one::class.java))
        }
    }
}
