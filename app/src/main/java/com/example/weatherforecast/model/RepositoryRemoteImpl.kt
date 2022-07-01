package com.example.weatherforecast.model

import com.example.weatherforecast.domen.Weather

class RepositoryRemoteImpl:RepositoryOne {

    override fun getWeather(lat: Double, lon: Double): Weather {
        Thread{
            Thread.sleep(300L)
        }.start()
        return Weather()
    }
}