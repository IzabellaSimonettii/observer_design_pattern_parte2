package observer_design_pattern_parte2;

public class Main {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		LastTempDisplay conditionsDisplay = new LastTempDisplay();
//		ForecastDisplay forecastDisplay = new ForecastDisplay();
		AverageDisplay statsDisplay = new AverageDisplay();

		wd.registerObserver(conditionsDisplay);
//		wd.registerObserver(forecastDisplay);
		wd.registerObserver(statsDisplay);
		wd.iniciar();
	}

}
