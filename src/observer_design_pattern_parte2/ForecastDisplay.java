package observer_design_pattern_parte2;

import java.util.Random;

public class ForecastDisplay implements Observer, DisplayElement {
	private Random gerador = new Random();

	@Override
	public void update(double temperature, double humidity, double pressure) {
		display(temperature, humidity, pressure);
	}

	@Override
	public void display(double t, double h, double p) {
		System.out.printf("Previsão: %.2f\n", (t - 2) + gerador.nextDouble() * 4);

	}

}
