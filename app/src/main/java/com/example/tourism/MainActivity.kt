package com.example.tourism

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var text:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        text=findViewById(R.id.textView3)
        text.setOnClickListener{
            Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()
            var i=Intent(this,SecondActivity::class.java)
            startActivity(i)
        }

    }
}