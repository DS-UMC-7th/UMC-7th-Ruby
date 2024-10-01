package com.example.umc

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 행복 감정
        val emotionImage1: ImageView = findViewById(R.id.emotionImage1)
        emotionImage1.setOnClickListener {
            val intent = Intent(this, HappyActivity::class.java)
            startActivity(intent)
        }

        // 흥분 감정
        val emotionImage2: ImageView = findViewById(R.id.emotionImage2)
        emotionImage2.setOnClickListener {
            val intent = Intent(this, ExcitedActivity::class.java)
            startActivity(intent)
        }

        // 평범 감정
        val emotionImage3: ImageView = findViewById(R.id.emotionImage3)
        emotionImage3.setOnClickListener {
            val intent = Intent(this, NormalActivity::class.java)
            startActivity(intent)
        }

        // 불안 감정
        val emotionImage4: ImageView = findViewById(R.id.emotionImage4)
        emotionImage4.setOnClickListener {
            val intent = Intent(this, AnxiousActivity::class.java)
            startActivity(intent)
        }

        // 분노 감정
        val emotionImage5: ImageView = findViewById(R.id.emotionImage5)
        emotionImage5.setOnClickListener {
            val intent = Intent(this, AngryActivity::class.java)
            startActivity(intent)
        }
    }
}
