package Session4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/* Se usan doubles y no enteros para evitar overflows */
		double fact = 1.0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime un número: ");
		double n = leer.nextDouble();
		for (double i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("El factorial de " + n + " es " + fact);
	}
}
