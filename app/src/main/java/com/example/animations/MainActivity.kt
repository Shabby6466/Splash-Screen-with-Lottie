package com.example.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, SecondActivity::class.java))
        },4000
        )

    }
}
