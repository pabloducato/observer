package pl.kocan.weather.weatherforecast;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import pl.kocan.weather.observer.Observer;

import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    @SuppressWarnings("deprecation")
    private Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);

    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }
    }

    public void updateForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
}
