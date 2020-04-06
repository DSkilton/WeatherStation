package com.HeadFirstDesignPatterns;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList(); //arrayList will hold the observers
    }

    public void registerObserver(Observer o) {
        observers.add(o); //when a new observer is created/ registered, it will be added to the end of the ArrayList
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(0);
        if (i >= 0) {
            observers.remove(i); //removing an observer from the arrayList
        }
    }

    public void notifyObservers(){
        for(int = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();;
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
