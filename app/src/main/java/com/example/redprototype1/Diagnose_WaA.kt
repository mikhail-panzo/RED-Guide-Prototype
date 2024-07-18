package com.example.redprototype1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_diagnose__wa.*

class Diagnose_WaA : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnose__wa)

        findViewById<TextView>(R.id.waa).text =
            "• Superficial wounds and abrasions should be irrigated with clean water, preferably " +
                    "tap water because of the benefit of pressure.\n\n" +
                    "• First aid providers may apply antibiotic ointment to skin abrasions and " +
                    "wounds to promote faster healing with less risk of infection.\n\n" +
                    "• First aid providers may apply an occlusive dressing to wounds and abrasions " +
                    "with or without antibiotic ointment.\n\n" +
                    "• The use of triple antibiotic ointment may be preferable to double- or singleagent " +
                    "antibiotic ointment or cream.\n\n" +
                    "• If antibiotic is not used, antiseptic could be used.\n\n" +
                    "• There is some evidence that traditional approaches, including applying honey, " +
                    "are beneficial and may be used on wounds by first aid providers.\n\n" +
                    "• People with wounds that develop redness, warmth or become painful or with " +
                    "wounds where the person develops fever should seek assessment from a " +
                    "healthcare provider."

        button.setOnClickListener {
            startActivity(Intent(this,maindiagnose_one::class.java))
        }
    }
}
