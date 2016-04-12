package designpatterns.observer;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * Created by esra on 12.04.2016.
 */
public class CurrentConditionDisplay implements DisplayElement, Observer {

    private Subject weatherData;
    private float humidity;
    private float temprature;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println("Current conditions: " + temprature + " F degree, " + humidity + " % humidity.");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.humidity = humidity;
        this.temprature = temp;
        display();

    }
}
