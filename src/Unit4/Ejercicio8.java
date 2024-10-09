/*
8. Construya en Java dos métodos que reciban como único parámetro una matriz de enteros. El primer 
método debe devolver la media aritmética de los enteros de la matriz. El segundo método debe 
devolver el valor máximo de la matriz. Construya un programa principal que lea una matriz de enteros, 
invoque a ambos métodos e imprima los valores devueltos. 
*/
package Unit4;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		int dimensionVector;
		int[] vector;
		Scanner leer = new Scanner(System.in);

		System.out.println("¿Cuántos elementos va a tener tu vector?");
		dimensionVector = leer.nextInt();
		vector = new int[dimensionVector];

		for (int i = 0; i < dimensionVector; i++) {
			System.out.println("Introduce valor que quieras tener en la posición " + i);
			vector[i] = leer.nextInt();
		}

		System.out.println("La media aritmética es: " + media(vector));
		System.out.println("El número mayor es: " + mayor(vector));
	}

	private static double media(int[] vector) {
		double suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		return (suma / vector.length);
	}

	private static int mayor(int[] vector) {
		int mayor = 0;
		for (int i = 0; i < vector.length; i++) {
			if (mayor < vector[i]) {
				mayor = vector[i];
			}
		}
		return mayor;
	}
}
