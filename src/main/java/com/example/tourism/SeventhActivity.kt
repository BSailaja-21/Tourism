package com.example.tourism

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SeventhActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var img10:ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_seventh)
        button1=findViewById(R.id.button1)
        img10=findViewById(R.id.img10)
        button1.setOnClickListener{
            var i= Intent(this,NinthActivity::class.java)
            startActivity(i)
        }
        img10.setOnClickListener {
            var i= Intent(this,NinthActivity::class.java)
            startActivity(i)

        }

    }
}