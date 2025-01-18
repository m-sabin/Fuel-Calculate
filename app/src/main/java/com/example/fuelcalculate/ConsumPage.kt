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
import com.google.android.material.snackbar.Snackbar

class ConsumPage : AppCompatActivity() {
    private lateinit var binding: ActivityConsumPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consum_page)
        binding = ActivityConsumPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fuelprice = intent.getFloatExtra("FuelPrice", 0f)

        binding.btnConsum.setOnClickListener {
            val fuelconsum = binding.tieConsum.text.toString()

            if (fuelconsum.isEmpty()) {
                Snackbar.make(
                    binding.tieConsum,
                    "Por favor, digite o Consumo do Carro",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {
                val fuelconsumFlt = fuelconsum.toFloatOrNull()

                if (fuelconsumFlt != null) {
                    val intent = Intent(this, KmPage::class.java)
                    intent.putExtra("FuelPrice", fuelprice)
                    intent.putExtra("FuelConsum", fuelconsumFlt)
                    startActivity(intent)
                } else {
                    Snackbar.make(
                        binding.tieConsum,
                        "Por favor, digite um número válido",
                        Snackbar.LENGTH_LONG
                    ).show()
                }
            }
        }
        binding.btnReturn.setOnClickListener {
            val intent = Intent(this, ValorPage::class.java)
            startActivity(intent)
        }
    }
}