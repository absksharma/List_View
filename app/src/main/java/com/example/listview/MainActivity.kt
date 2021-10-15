package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lvCars.isClickable = true
        binding.lvCars.adapter = ArrayAdapter<String>(
            this, R.layout.list_items_cars, R.id.tvCars,
            arrayOf(
                "BMW",
                "Lamborghini Diablo",
                "Ferrari Testarossa",
                "Jensen Interceptor",
                "Lamborghini Huracán",
                "Porsche 911 Carrera",
                "Ferrari 812 Superfast",
                "Jeep Gladiator",
                "BMW",
                "Lamborghini Diablo",
                "Ferrari Testarossa",
                "Jensen Interceptor",
                "Lamborghini Huracán",
                "Porsche 911 Carrera",
                "Ferrari 812 Superfast",
                "Jeep Gladiator"
            )

        )
        binding.lvCars.setOnItemClickListener { parent, _, position, _ ->
            Toast.makeText(this, "${parent.getItemAtPosition(position)} Car is Selected", Toast.LENGTH_SHORT).show()
        }
    }

}