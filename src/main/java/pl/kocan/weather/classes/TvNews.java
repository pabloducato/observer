package pl.kocan.weather.classes;

import pl.kocan.weather.observer.Observer;
import pl.kocan.weather.weatherforecast.WeatherForecast;

public class TvNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
