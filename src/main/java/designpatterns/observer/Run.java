package designpatterns.observer;

/**
 * Created by esra on 12.04.2016.
 */
public class Run {

    public static void main(String[] args){
        WeatherData wd = new WeatherData();

        CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);

        wd.setMeasurements(80,65,30);
    }
}
