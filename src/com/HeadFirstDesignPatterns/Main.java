package com.HeadFirstDesignPatterns;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {

    public static void main(String[] args) {
	    WeatherData weatherData = new WeatherData();

	    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//	    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

	    weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

	class myMouseListener implements MouseListener {
		public void mouseClicked(MouseEvent event){
			System.out.println("Mouse click @ position x = " + event.getX() + " y = " + event.getY());
		}

		@Override
		public void mousePressed(MouseEvent mouseEvent) {

		}

		@Override
		public void mouseReleased(MouseEvent mouseEvent) {

		}

		@Override
		public void mouseEntered(MouseEvent mouseEvent) {

		}

		@Override
		public void mouseExited(MouseEvent mouseEvent) {

		}
	}
}



