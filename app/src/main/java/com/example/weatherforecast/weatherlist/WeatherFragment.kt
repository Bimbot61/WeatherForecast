package com.example.weatherforecast.weatherlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weatherforecast.databinding.FragmentWeatherListBinding


class WeatherFragment : Fragment() {
    companion object {
        fun newInstance() = WeatherFragment()
    }
lateinit var binding: FragmentWeatherListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWeatherListBinding.inflate(inflater)
        return binding.root
    }
}
