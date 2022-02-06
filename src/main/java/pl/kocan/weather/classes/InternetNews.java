package pl.kocan.weather.classes;

import pl.kocan.weather.observer.Observer;
import pl.kocan.weather.weatherforecast.WeatherForecast;

public class InternetNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
