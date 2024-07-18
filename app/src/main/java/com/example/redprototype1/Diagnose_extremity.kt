package com.example.redprototype1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_diagnose_extremity.*
import org.w3c.dom.Text

class Diagnose_extremity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnose_extremity)

        findViewById<TextView>(R.id.extremity).text =
            "• A first aid provider could cool a sprained joint and soft-tissue injury.\n\n" +
                    "• First aid providers should assume that any injury to an extremity could " +
                    "include a potential bone fracture and manually stabilize the extremity injury " +
                    "in the position found.\n\n" +
                    "• There is insufficient information to make recommendations for straightening " +
                    "an angulated fracture. For remote situations, wilderness environments or " +
                    "special circumstances with a cool and pale extremity this may be considered " +
                    "by a trained first aid provider.\n\n" +
                    "• Ice or cooling should NOT be applied for more than 20 minutes.\n\n" +
                    "• First aid providers should assess for haemorrhage in all fractures and treat " +
                    "for shock in fracture involving long bones, especially femur, due to possibility " +
                    "of significant internal haemorrhage.\n\n" +
                    "• Based on training and circumstance, providers may need to move an injured " +
                    "limb or person. In such situations, providers should protect the injured person. " +
                    "This includes splinting in a way that limits pain, reduces the chance " +
                    "for further injury, and facilitates safe and prompt transport."

        button.setOnClickListener {
            startActivity(Intent(this,maindiagnose_one::class.java))
        }
    }
}
