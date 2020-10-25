package com.example.learn.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learn.MainActivity
import com.example.learn.R

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME)
        super.onCreate(savedInstanceState)
    }
}