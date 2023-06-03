package br.com.residencia.api.calculadora.domain;

public class Calculadora {

	private double num1;
	private double num2;

	public Calculadora(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double soma() {
		return num1 + num2;
	}

	public double sub() {
		return num1 - num2;
	}

	public double multi() {
		return num1 * num2;
	}

	public double div() {
		return num1 / num2;
	}

}