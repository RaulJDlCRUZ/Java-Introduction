/* 12. Diseñe e implemente un programa en Java que rellene una matriz
monodimensional con los primeros n enteros mayores o iguales que cero,
donde n es un valor leído por teclado, y que escriba la matriz en orden
inverso (del último elemento al primero).
*/
package Unit3;

import java.util.Scanner;

public class Monodimensional {
	public static void main(String[] args) {
		// Declaramos las variables que vayamos a usar
		int n;
		int[] array;

		// Leemos por entrada estándar el número n => máximo a imprimir
		Scanner lectura = new Scanner(System.in);
		System.out.println("Inserte el número");
		n = lectura.nextInt();

		// Controlar que sea mayor o igual que cero (longitud 0 no admitida)
		while (n < 1) {
			System.out.println("Inserte un número mayor que 0");
			n = lectura.nextInt();
		}

		// Ahora asignamos a la matriz destino las dimensiones deseadas
		array = new int[n];

		// Guardar y mostrar los números en orden inverso, restando n al iterador
		for (int i = 0; i < n; i++) {
			array[i] = n - i;
			System.out.println("Posición: " + i + " número: " + array[i]);
		}
	}
}