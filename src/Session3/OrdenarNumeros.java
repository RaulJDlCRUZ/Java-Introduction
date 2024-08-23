/* Realizar un ejercicio que lea tres números por teclado usando la clase Scanner.
Imprima en orden descendente los tres números
*/
package Session3;

import java.util.Locale;
import java.util.Scanner; //Importamos las librerías necesarias

public class OrdenarNumeros {
	public static void main(String[] args) {
		int a, b, c; // Declaramos las variables de tipo entero
		Scanner leer = new Scanner(System.in);
		leer.useLocale(Locale.US); // Activamos el escáner
		System.out.println("Escribe el numero 1: ");
		a = leer.nextInt();
		System.out.println("Escribe el numero 2: ");
		b = leer.nextInt();
		System.out.println("Escribe el numero 3: ");
		c = leer.nextInt();
		/*
		Una vez son tomados los datos haremos una distinción para el caso en el que
		los 3 valores son el mismo.
		Dejando ese caso de lado, tenemos otras 3! = 6 combinaciones.
		En todos los casos, obligaremos al programa a cerrarse con "System.exit(0)",
		para no causar conflictos con otros IF y así que solo escriba una sucesión
		*/
		if (a == b && b == c) {
			System.out.printf(a + ", " + b + ", " + c);
			System.exit(0);
		}
		if (a >= b && a >= c) {
			if (b >= c) {
				System.out.printf(a + ", " + b + ", " + c);
				System.exit(0);
			} else {
				System.out.printf(a + ", " + c + ", " + b);
				System.exit(0);
			}
		}
		if (b >= a && b >= c) {
			if (a >= c) {
				System.out.printf(b + ", " + a + ", " + c);
				System.exit(0);
			} else {
				System.out.printf(b + ", " + c + ", " + a);
				System.exit(0);
			}
		}
		if (c >= a && c >= b) {
			if (a >= b) {
				System.out.printf(c + ", " + a + ", " + b);
				System.exit(0);
			} else {
				System.out.printf(c + ", " + b + ", " + a);
				System.exit(0);
			}
		}
	} // Fin del main
} // Fin de la clase