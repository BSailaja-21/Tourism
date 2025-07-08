package com.example.tourism

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity


class NinthActivity : AppCompatActivity() {
    lateinit var button02:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_ninth)

        button02=findViewById(R.id.button02)
        button02.setOnClickListener{
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://maps.app.goo.gl/srpHV9NfWx2eJs5P8")
            startActivity(openURL)
        }

    }
}