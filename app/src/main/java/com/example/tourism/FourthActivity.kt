package com.example.tourism

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity


class FourthActivity : AppCompatActivity() {
    lateinit var img:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fourth)
        img=findViewById(R.id.img)
        img.setOnClickListener{
            var i= Intent(this,ThirdActivity::class.java)
            startActivity(i)
        }

    }
}