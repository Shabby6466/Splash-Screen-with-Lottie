package com.example.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val text = findViewById<TextView>(R.id.textView)

        val animate = AnimationUtils.loadAnimation(this, R.anim.move)

        text.startAnimation(animate)
    }
}