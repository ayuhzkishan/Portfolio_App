package com.example.portfolio_app

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val twitterLogo = findViewById<ImageView>(R.id.twitter_logo)
        val githubLogo = findViewById<ImageView>(R.id.github_logo)
        val gmailLogo = findViewById<ImageView>(R.id.gmail_logo)
        val linkedinLogo = findViewById<ImageView>(R.id.linkedin_logo)


        twitterLogo.setOnClickListener {
            val twitterIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"))
            startActivity(twitterIntent)
        }


        githubLogo.setOnClickListener {
            val githubIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ayuhzkishan"))
            startActivity(githubIntent)
        }


        gmailLogo.setOnClickListener {
            val gmailIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com"))
            startActivity(gmailIntent)
        }


        linkedinLogo.setOnClickListener {
            val linkedInIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/ayush-kishan/"))
            startActivity(linkedInIntent)
        }
}}
