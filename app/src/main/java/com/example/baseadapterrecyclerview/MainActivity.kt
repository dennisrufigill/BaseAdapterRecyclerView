package com.example.baseadapterrecyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.baseadapterrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val countryAdapter by lazy {
        CountryAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfCountries = arrayListOf(
            "UK", "USA", "Australia", "Canada", "Germany", "France",
            "Russia", "China", "Japan","Brazil")


        binding.recyclerView.adapter = countryAdapter
        countryAdapter.addItems(listOfCountries)
        countryAdapter.itemClickListener = { view, item, position ->
            Toast.makeText(this, item, Toast.LENGTH_SHORT).show()
        }

    }

}