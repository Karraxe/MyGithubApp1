package com.yovan.mygithubapp1.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.yovan.mygithubapp1.MainActivity
import com.yovan.mygithubapp1.R

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val splashTime: Long = 3500L
        Handler().postDelayed({
            val mIntent = Intent(this@Splash, MainActivity::class.java)
            startActivity(mIntent)
            finish()
        }, 2000)
    }
}