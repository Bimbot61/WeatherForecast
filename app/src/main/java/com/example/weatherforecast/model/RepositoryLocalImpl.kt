package com.example.weatherforecast.model

import com.example.weatherforecast.domen.Weather
import com.example.weatherforecast.domen.getRussianCities
import com.example.weatherforecast.domen.getWorldCities

class RepositoryLocalImpl : RepositoryMany,RepositoryOne {
    override fun getListWeather(location: Location): List<Weather> {
        return when (location) {
            Location.Russian -> {
                getRussianCities()
            }
            Location.World -> {
                getWorldCities()
            }
        }
    }

    override fun getWeather(lat: Double, lon: Double): Weather {
        return Weather()
    }
}