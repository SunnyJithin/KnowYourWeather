package com.jithins.knowyourweather.presentation

import com.jithins.knowyourweather.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)