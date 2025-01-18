package com.example.fuelcalculate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fuelcalculate.databinding.ActivityValorPageBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class ValorPage : AppCompatActivity() {
    private lateinit var binding: ActivityValorPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_valor_page)
        binding = ActivityValorPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnValor.setOnClickListener {
            val fuelprice = binding.tiePrice.text.toString()

            if (fuelprice.isEmpty()) {
                Snackbar.make(
                    binding.tiePrice,
                    "Por favor, digite o valor",
                    Snackbar.LENGTH_LONG
                )
                    .show()
            } else {
                val fuelpriceFlt = fuelprice.toFloatOrNull()

                if (fuelpriceFlt != null) {
                    val intent = Intent(this, ConsumPage::class.java)
                    intent.putExtra("FuelPrice", fuelpriceFlt)
                    startActivity(intent)
                } else {
                    Snackbar.make(
                        binding.tiePrice, "Por favor, insere um valor válido", Snackbar.LENGTH_LONG
                    ).show()
                }
            }

        }
        binding.btnReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}