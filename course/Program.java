package course;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
	
	//public static final double PI = 3.14159; // Padrão de nome para constante é em letra maiúscula
	
	// Inicio do método Main
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI values: %.2f%n ", calc.PI);
		
		sc.close();

	} // Fim do método main

	
	
	/*
	              Versão 1
	// métodos para calcular volume e circunferência
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
        */
}
