package com.example.projectn2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.logging.Logger.global


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var num1 = findViewById<TextView>(R.id.textView3)
        var num2 = findViewById<TextView>(R.id.textView4)
        var sum = findViewById<TextView>(R.id.textView5)
        var button = findViewById<Button>(R.id.button)

        num1.setOnClickListener{
            var nomeri1=num1.text.toString().toInt()

        }
        num2.setOnClickListener{
            var nomeri2=num2.text.toString().toInt()

        }

        button.setOnClickListener {
            var nomeri1=num1.text.toString().toInt()
            var nomeri2=num2.text.toString().toInt()
            var Jami=nomeri1 + nomeri2
            sum.text=Jami.toString()
        }


    }
}