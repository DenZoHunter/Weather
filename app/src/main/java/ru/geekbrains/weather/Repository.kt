package ru.geekbrains.weather

object Repository {
    private var weatherList = listOf(Weather ("Краснодар", 15, WeatherType.RAINY))

    fun getWeatherList(): List<Weather> {
        return weatherList
    }
}