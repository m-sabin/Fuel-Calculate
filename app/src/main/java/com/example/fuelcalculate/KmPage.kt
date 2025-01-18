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
import com.google.android.material.snackbar.Snackbar

class KmPage : AppCompatActivity() {
    private lateinit var binding: ActivityKmPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_km_page)
        binding = ActivityKmPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fuelprice = intent.getFloatExtra("FuelPrice", 0f)
        val fuelconsum = intent.getFloatExtra("FuelConsum", 0f)


        binding.btnKm.setOnClickListener {
            val fuelkm = binding.tieKm.text.toString()

            if (fuelkm.isEmpty()) {
                Snackbar.make(
                    binding.tieKm,
                    "Por favor, digite o kilometragem a percorrer",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {
                val fuelkmFlt = fuelkm.toFloatOrNull()
                if (fuelkmFlt != null) {
                    val intent = Intent(this, ResultPage::class.java)
                    intent.putExtra("FuelPrice", fuelprice)
                    intent.putExtra("FuelConsum", fuelconsum)
                    intent.putExtra("FuelKm", fuelkmFlt)

                    startActivity(intent)
                } else {
                    Snackbar.make(binding.tieKm, "Digite um número válido", Snackbar.LENGTH_LONG)
                        .show()
                }

            }

        }

        binding.btnReturn.setOnClickListener {
            val intent = Intent(this, ConsumPage::class.java)
            startActivity(intent)
        }
    }

}