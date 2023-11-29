package com.jithins.knowyourweather.domain.repository

import com.jithins.knowyourweather.domain.util.Resource
import com.jithins.knowyourweather.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}