package observer_design_pattern_parte2;

import java.util.ArrayList;

public class LastTempDisplay implements Observer, DisplayElement {

	private ArrayList<Double> temps = new ArrayList<>();

	@Override
	public void update(double temperature, double humidity, double pressure) {

		if (temps.size() > 9) {
			temps.remove(0);
		}
		temps.add(temperature);
		display(temperature, humidity, pressure);
	}

	@Override
	public void display(double t, double h, double p) {

		temps.forEach((temp) -> {
			System.out.printf("Temp: %.2f\n", temp);
		});
	}

}