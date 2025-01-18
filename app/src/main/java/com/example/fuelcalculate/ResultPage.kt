package com.example.fuelcalculate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fuelcalculate.databinding.ActivityKmPageBinding
import com.example.fuelcalculate.databinding.ActivityResultPageBinding

class ResultPage : AppCompatActivity() {
    private lateinit var binding: ActivityResultPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_page)
        binding = ActivityResultPageBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnFinish.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }

    }
}