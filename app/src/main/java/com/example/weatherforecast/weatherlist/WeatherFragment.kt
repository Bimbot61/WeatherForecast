package com.example.weatherforecast.weatherlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.weatherforecast.databinding.FragmentWeatherListBinding
import com.example.weatherforecast.viewmodel.AppState


class WeatherFragment : Fragment() {
    companion object {
        fun newInstance() = WeatherFragment()
    }
lateinit var binding: FragmentWeatherListBinding
    lateinit var viewModel: WeatherListViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWeatherListBinding.inflate(inflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(WeatherListViewModel::class.java)
        viewModel.liveData.observe(viewLifecycleOwner,object : Observer<AppState> {
            override fun onChanged(t: AppState) {
Toast.makeText(requireContext(), "Работает $t", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
