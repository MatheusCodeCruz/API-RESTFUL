package br.com.residencia.api.calculadora.services;

import org.springframework.stereotype.Service;

import br.com.residencia.api.calculadora.domain.Calculadora;

@Service
public class CalculadoraService {

	public double soma(double num1, double num2) {
		Calculadora calc = new Calculadora(num1, num2);
		return calc.soma();
	}

	public double sub(double num1, double num2) {
		Calculadora calc = new Calculadora(num1, num2);
		return calc.sub();
	}

	public double multi(double num1, double num2) {
		Calculadora calc = new Calculadora(num1, num2);
		return calc.multi();
	}

	public double div(double num1, double num2) {
		if (num2 == 0) {
			throw new ArithmeticException("Divisão por zero não é permitido!");
		}

		Calculadora calc = new Calculadora(num1, num2);
		return calc.div();
	}

}
