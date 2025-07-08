package com.example.tourism

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity



class ThirdActivity : AppCompatActivity() {
    private lateinit var img1:ImageView
    private lateinit var img2:ImageView
    private lateinit var img8:ImageView
    private lateinit var text:TextView
    lateinit var text1:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_third)
        img1=findViewById(R.id.img1)
        img2=findViewById<ImageView>(R.id.img2)
        img8=findViewById<ImageView>(R.id.img8)
        text=findViewById(R.id.text)
        text1=findViewById(R.id.text1)

        text1.setOnClickListener{
            val openURL= Intent(Intent.ACTION_VIEW)
            openURL.data=Uri.parse("https://www.google.com/search?q=google&oq=google&gs_lcrp=EgZjaHJvbWUqEAgAEAAYgwEY4wIYsQMYgAQyEAgAEAAYgwEY4wIYsQMYgAQyEwgBEC4YgwEYxwEYsQMY0QMYgAQyDQgCEAAYgwEYsQMYgAQyDQgDEAAYgwEYsQMYgAQyDQgEEAAYgwEYsQMYgAQyDQgFEAAYgwEYsQMYgAQyCggGEAAYsQMYgAQyCggHEAAYsQMYgAQyCggIEAAYsQMYgAQyBwgJEAAYjwLSAQk0OTM5ajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8")
            startActivity(openURL)
        }
        img1.setOnClickListener{
            var i= Intent(this,FourthActivity::class.java)
            startActivity(i)

        }
        img2.setOnClickListener{
            var i= Intent(this,FifthActivity::class.java)
            startActivity(i)

        }
        img8.setOnClickListener{
            var i= Intent(this,SixthActivity::class.java)
            startActivity(i)
        }
        text.setOnClickListener{
            var i=Intent(this,SeventhActivity::class.java)
            startActivity(i)
        }

    }

        
}





