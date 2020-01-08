package headfirst.observer.weather;

import java.util.*;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	//constructor en registratie observer
	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	//geimplementeerd met Observer interface
	public void update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	//geimplementeerd met DisplayElement display
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
