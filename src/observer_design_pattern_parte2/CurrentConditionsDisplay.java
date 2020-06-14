package observer_design_pattern_parte2;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	@Override
	public void update(double temperature, double humidity, double pressure) {
		display(temperature, humidity, pressure);
	}

	@Override
	public void display(double t, double h, double p) {
//		for
//		System.out.printf("T: %.2f\nH: %.2f\nP: %.2f\n", t, h, p);
	}

}
