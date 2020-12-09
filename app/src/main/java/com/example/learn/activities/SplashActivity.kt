package com.example.learn.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.learn.R

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_splash)
        val splashScreenLogo = findViewById<ImageView>(R.id.splash_screen_logo)

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME)

        val fadeIn = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)
        splashScreenLogo.startAnimation(fadeIn)

        super.onCreate(savedInstanceState)
    }
}