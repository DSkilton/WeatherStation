package com.HeadFirstDesignPatterns;

public interface Subject {
    // takes observer as argument, they will be registered or removed
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    // will notify all observers to any state changes
    public void notifyObservers();
}


public interface Observer{
    public void update  (float temp, float humidity, float pressure);

}

public interface DisplayElement {
    public void display(); 

}
