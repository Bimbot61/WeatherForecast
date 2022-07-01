package com.example.weatherforecast.view.details

import com.example.weatherforecast.domen.Weather

fun interface OnItemClick {
    fun onItemClick(weather: Weather)
}