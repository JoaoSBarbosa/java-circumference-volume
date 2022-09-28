package util;

public class Calculator {
	public static final double PI = 3.14159; // Padr�o de nome para constante � em letra mai�scula

	// m�todos para calcular volume e circunfer�ncia
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public  double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
