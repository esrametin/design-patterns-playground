package designpatterns.observer;


import java.util.ArrayList;

public class WeatherData implements Subject {

    private float humidity;
    private float pressure;
    private float temprature;
    private ArrayList<Observer> observers = new ArrayList<>();

    public void measurementsChanged(){
        notifyObservers();
    }


    public void setMeasurements(float humidity, float temp, float pressure) {
        this.temprature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0) {
        observers.remove(i); }
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
                o.update(temprature, humidity, pressure);
        }
    }
}
