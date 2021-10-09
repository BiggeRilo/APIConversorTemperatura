package br.com.atomjuice.temperatureconverser.models;

public class Converter {

	private double temperaturaCelsius;
	private double temperaturaFahrenheit;
	private double temperaturaKelvin;
	
	public Converter(){
	//Constructor padrão
	}
	
	public Converter(double temperaturaCelsius, double temperaturaFhrenheit, double temperaturaKelvin) {
		this.temperaturaCelsius = temperaturaCelsius;
		this.temperaturaFahrenheit = temperaturaFhrenheit;
		this.temperaturaKelvin = temperaturaKelvin;
	}

	public double getTemperaturaCelsius() {
		return temperaturaCelsius;
	}

	public void setTemperaturaCelsius(double temperaturaCelsius) {
		this.temperaturaCelsius = temperaturaCelsius;
	}

	public double getTemperaturaFhrenheit() {
		return temperaturaFahrenheit;
	}

	public void setTemperaturaFhrenheit(double temperaturaFhrenheit) {
		this.temperaturaFahrenheit = temperaturaFhrenheit;
	}

	public double getTemperaturaKelvin() {
		return temperaturaKelvin;
	}

	public void setTemperaturaKelvin(double temperaturaKelvin) {
		this.temperaturaKelvin = temperaturaKelvin;
	}
	
	
}
