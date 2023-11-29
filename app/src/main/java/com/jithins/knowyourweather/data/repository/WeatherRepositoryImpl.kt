package com.jithins.knowyourweather.data.repository

import com.jithins.knowyourweather.data.mapper.toWeatherInfo
import com.jithins.knowyourweather.data.remote.WeatherApi
import com.jithins.knowyourweather.domain.repository.WeatherRepository
import com.jithins.knowyourweather.domain.util.Resource
import com.jithins.knowyourweather.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(private val api: WeatherApi) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred")
        }
    }
}