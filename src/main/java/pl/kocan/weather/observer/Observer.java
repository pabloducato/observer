package pl.kocan.weather.observer;

import pl.kocan.weather.weatherforecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);

}
