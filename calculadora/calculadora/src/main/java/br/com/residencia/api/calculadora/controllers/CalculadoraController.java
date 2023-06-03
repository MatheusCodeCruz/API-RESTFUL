package br.com.residencia.api.calculadora.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.residencia.api.calculadora.services.CalculadoraService;

@RestController // Anotação de Start do contoller
@RequestMapping("/calculadora")// Anotação utilizada para mapear a requição
public class CalculadoraController {
	 
	@Autowired
	    private CalculadoraService calculadoraService;
	 	
	 	//http://localhost:8080/calculadora/soma
	    @GetMapping("/soma")
	    public double soma(@RequestParam double num1, @RequestParam double num2) {
	        return calculadoraService.soma(num1, num2);
	    }

	    @GetMapping("/sub")
	    public double sub(@RequestParam double num1, @RequestParam double num2) {
	        return calculadoraService.sub(num1, num2);
	    }

	    @GetMapping("/multi")
	    public double multi(@RequestParam double num1, @RequestParam double num2) {
	        return calculadoraService.multi(num1, num2);
	    }

	    @GetMapping("/div")
	    public double div(@RequestParam double num1, @RequestParam double num2) {
	        return calculadoraService.div(num1, num2);
	    }
}

	

