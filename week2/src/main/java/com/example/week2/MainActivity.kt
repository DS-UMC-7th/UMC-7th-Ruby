package com.example.week2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.week2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.setOnItemSelectedListener { item ->
            val transaction = supportFragmentManager.beginTransaction()

            transaction.setCustomAnimations(
                R.anim.fade_in,
                R.anim.fade_out
            )

            when (item.itemId) {
                R.id.fragment_home -> {
                    transaction.replace(R.id.main_container, HomeFragment()).commit()
                    true
                }
                R.id.fragment_favorite -> {
                    transaction.replace(R.id.main_container, FavoriteFragment()).commit()
                    true
                }
                R.id.fragment_category -> {
                    transaction.replace(R.id.main_container, CategoryFragment()).commit()
                    true
                }
                R.id.fragment_setting -> {
                    transaction.replace(R.id.main_container, SettingFragment()).commit()
                    true
                }
                else -> false
            }
        }

    }
}