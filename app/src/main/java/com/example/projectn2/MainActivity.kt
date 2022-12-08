package com.example.projectn2

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<TextView>(R.id.clickbutton)
        val number =findViewById<TextView>(R.id.numberr1)
        val kleba = findViewById<TextView>(R.id.decrease)
        val play = findViewById<TextView>(R.id.textView)
        button.setOnClickListener{
            var nomeri = number.text.toString().toInt()
            nomeri++
            number.text=nomeri.toString()
        }
        kleba.setOnClickListener{
            var dakleba = number.text.toString().toInt()
            dakleba -= 1
            number.text=dakleba.toString()
        }
        play.setOnClickListener{
            Toast.makeText(this, "Good Job", Toast.LENGTH_SHORT).show()
        }
        play.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
            finish()
        }


    }
}