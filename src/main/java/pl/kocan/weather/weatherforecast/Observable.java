package pl.kocan.weather.weatherforecast;


import pl.kocan.weather.observer.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

}
