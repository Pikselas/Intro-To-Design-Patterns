package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// The subject interface (Observable)
interface Subject {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObservers();
}

// The concrete subject
class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<WeatherObserver> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // This method is called whenever weather measurements change
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}


// The observer interface
interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}

// Concrete observers
class CurrentConditionsDisplay implements WeatherObserver {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}


public class Observer {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // Create observers (displays)
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();

        // Register observers with the subject (WeatherData)
        weatherData.registerObserver(currentDisplay);

        // Simulate weather changes
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
