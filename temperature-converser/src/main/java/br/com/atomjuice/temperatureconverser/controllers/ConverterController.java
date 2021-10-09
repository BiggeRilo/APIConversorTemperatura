package br.com.atomjuice.temperatureconverser.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.atomjuice.temperatureconverser.models.Converter;

@RestController
@RequestMapping(path = "/converter")
public class ConverterController {

	@GetMapping(path = "/celsius")
	public Converter conveterCelcius(@RequestParam(name = "temp") double tempCelsius){
		return new Converter(tempCelsius, (tempCelsius * 9/5) + 32 , tempCelsius + 273.15);
	}
	
	@GetMapping(path = "/fahrenheit")
	public Converter converterFahrenheit(@RequestParam(name = "temp") double tempFahrenheit) {
		return new Converter((tempFahrenheit - 32) * 5/9 ,tempFahrenheit,(tempFahrenheit + 459.67) * 5/9);
	}
	
	@GetMapping(path = "/kelvin")
	public Converter converterKelvin(@RequestParam(name = "temp") double tempKelvin) {
		return new Converter(tempKelvin - 273.15 , (tempKelvin * 9/5) - 459.67 ,tempKelvin);
	}
	
}
