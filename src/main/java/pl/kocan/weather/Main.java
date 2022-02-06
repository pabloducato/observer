package pl.kocan.weather;

import pl.kocan.weather.classes.InternetNews;
import pl.kocan.weather.classes.RadioNews;
import pl.kocan.weather.classes.TvNews;
import pl.kocan.weather.weatherforecast.WeatherForecast;

public class Main {

    public static void main(String[] args) {
        System.out.println("Launching 123");

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);

        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);

        System.out.println("\nNowa prognoza - powiadomienie tylko dla serwisu internetowego:");

        weatherForecast.updateForecast(18, 1007);

    }

}
