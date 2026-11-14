package com.example.tourism

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    lateinit var signUp:TextView
    lateinit var logIn:TextView
    lateinit var signUpLayout: LinearLayout
    lateinit var logInLayout: LinearLayout
    lateinit var signIn:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_second)

        signUp=findViewById(R.id.signUp)
        logIn=findViewById(R.id.logIn)
        signUpLayout=findViewById(R.id.signUpLayout)
        logInLayout=findViewById(R.id.logInLayout)
        signIn=findViewById(R.id.signIn)
        signUp.setOnClickListener{
            signUp.background = resources.getDrawable(R.drawable.switch_trcks,null)
            signUp.setTextColor(resources.getColor(R.color.textColor,null))
            logIn.background = null
            signUpLayout.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE
            logIn.setTextColor(resources.getColor(R.color.pinkColor,null))


        }
        logIn.setOnClickListener{
            signUp.background = null
            signUp.setTextColor(resources.getColor(R.color.pinkColor,null))
            logIn.background = resources.getDrawable(R.drawable.switch_trcks,null)
            signUpLayout.visibility = View.GONE
            logInLayout.visibility = View.VISIBLE
            logIn.setTextColor(resources.getColor(R.color.textColor,null))


        }
        signIn.setOnClickListener{
            startActivity(Intent(this@SecondActivity,ThirdActivity::class.java))
        }


    }
}