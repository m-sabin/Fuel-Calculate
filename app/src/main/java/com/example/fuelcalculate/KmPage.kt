package com.example.fuelcalculate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fuelcalculate.databinding.ActivityKmPageBinding

class KmPage : AppCompatActivity() {
    private lateinit var binding: ActivityKmPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_km_page)
        binding = ActivityKmPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReturn.setOnClickListener {
            val intent = Intent(this, ConsumPage::class.java)
            startActivity(intent)
        }

        binding.btnKm.setOnClickListener {
            val intent = Intent(this, ResultPage::class.java)
            startActivity(intent)
        }
    }

}