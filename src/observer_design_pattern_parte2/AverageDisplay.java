package observer_design_pattern_parte2;

import java.util.ArrayList;

public class AverageDisplay implements Observer, DisplayElement {

	private ArrayList<Double> temps = new ArrayList<>();

	@Override
	public void update(double temperature, double humidity, double pressure) {
		if (temps.size() > 9) {
			temps.remove(0);
		}
		temps.add(temperature);
		Double media = temps.stream().mapToDouble(a -> a).average().getAsDouble();
		display(media, humidity, pressure);
	}

	@Override
	public void display(double t, double h, double p) {
		System.out.printf("Media das 10 ultimas temperaturas: %.2f\n", t);
	}

}
