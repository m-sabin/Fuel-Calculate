package com.example.fuelcalculate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fuelcalculate.databinding.ActivityConsumPageBinding

class ConsumPage : AppCompatActivity() {
    private lateinit var binding:ActivityConsumPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consum_page)
        binding = ActivityConsumPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnReturn.setOnClickListener {
            val intent = Intent(this, ValorPage::class.java)
            startActivity(intent)
        }

        binding.btnConsum.setOnClickListener {
            val intent = Intent(this, KmPage::class.java)
            startActivity(intent)
        }
    }
}