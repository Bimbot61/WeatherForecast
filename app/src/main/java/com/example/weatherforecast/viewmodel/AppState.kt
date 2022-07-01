package com.example.weatherforecast.viewmodel

import com.example.weatherforecast.domen.Weather

sealed class AppState {
    data class SuccessOne(val weatherData: Weather) : AppState()
    data class SuccessMulti(val weatherList: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}


