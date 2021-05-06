package Observer.Display;

import Observer.Observer;
import Subject.WeatherData;

public class MaxValueDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;

    public MaxValueDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The highest is: " + Math.max(Math.max(temperature, humidity), pressure));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;

        display();
    }
}
