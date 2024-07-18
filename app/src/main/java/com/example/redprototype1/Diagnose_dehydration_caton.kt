package com.example.redprototype1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_diagnose_dehydration_caton.*

class Diagnose_dehydration_caton : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnose_dehydration_caton)

        findViewById<TextView>(R.id.dehydration).text =
            "• In cases of dehydration, first aid providers should rehydrate the person using\n" +
                    "ORS.\n\n" +
                    "• Either a commercially prepared ORS or a pre-prepared salt package for oral " +
                    "rehydration that complies with World Health Organization recommendations " +
                    "for ORS solutions should be used for rehydration.\n\n" +
                    "• First aid providers could use three per cent to eight per cent carbohydrate-electrolyte " +
                    "drinks for exertion-related dehydration.\n\n" +
                    "• If three per cent to eight per cent carbohydrate-electrolyte drinks are not " +
                    "available or not tolerated, alternative beverages for rehydration include " +
                    "water, 12 per cent carbohydrate-electrolyte solution, coconut water, two per " +
                    "cent milk, tea, tea-carbohydrate-electrolyte, or caffeinated tea beverages.\n\n" +
                    "• In the absence of pre-prepared solutions, a homemade solution may be used " +
                    "for dehydration.\n\n" +
                    "• If symptoms of gastrointestinal distress appear suddenly, are serious or are " +
                    "accompanied by dehydration (or the latter appears alone), emergency treatment " +
                    "should be sought. Even mild cases of gastrointestinal distress may " +
                    "require a medical examination although the need is not necessarily urgent."

        findViewById<TextView>(R.id.possible).text =
            "Cholera\nGastroentiritis"

        button.setOnClickListener {
            startActivity(Intent(this,maindiagnose_one::class.java))
        }
    }
}
