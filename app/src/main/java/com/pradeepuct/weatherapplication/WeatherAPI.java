package com.pradeepuct.weatherapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI
{
    @GET("weather?lat=12.8993901&lon=79.0832372&appid=c6da285829d40ccbfe99f6cba0f88a7d&units=metric")
    Call<WeatherApplication>getWeatherWithLocation(@Query("lat")double lat,@Query("lon")double lon);

    @GET("weather?lat=12.8993901&lon=79.0832372&appid=c6da285829d40ccbfe99f6cba0f88a7d&units=metric")
    Call<WeatherApplication>getWeatherWithCity(@Query("q")String name);

}
