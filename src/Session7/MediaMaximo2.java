/*
MediaMaximo sin llamar a las funciones de otro fichero java,
sino que las funciones están en el mismo fichero
*/
package Session7;

import java.util.Scanner;

public class MediaMaximo2 {
	public static void main(String[] args) {
		int[] v1 = null;
		int n, maximo, media;
		int[] matriz2 = { 3, 4, 5, 67, 3, 7, 3, 4, 5 };
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca la longitud de la matriz: ");
		n = leer.nextInt();
		v1 = new int[n];
		System.out.println("\nIntroduzca los valores de la matriz separados por blancos ");

		for (int i = 0; i < n; i++) {
			v1[i] = leer.nextInt();
		}
		media = media(v1);
		maximo = maximo(v1);
		System.out.println("\nLa media es: " + media);
		System.out.println("El máximo es: " + maximo);
		media = media(matriz2);
		maximo = maximo(matriz2);
		System.out.println("\nLa media de matriz 2 es: " + media);
		System.out.println("El máximo de matriz 2 es: " + maximo);

	}

	public static int media(int[] matriz) {
		int valor = 0;
		for (int i = 0; i < matriz.length; i++) {
			valor = valor + matriz[i];
		}
		valor = valor / matriz.length;
		return valor;
	}

	public static int maximo(int[] matriz) {
		int valor = matriz[0];
		for (int i = 1; i < matriz.length; i++) {
			if (valor < matriz[i]) {
				valor = matriz[i];
			}
		}
		return valor;
	}

}