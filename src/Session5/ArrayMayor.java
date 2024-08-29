/* Diseñar y codificar un programa para determinar el número entero mayor de cada índice comparando dos vectores.
- Se pide realizar una mejora sobre el ejemplo visto en clase en el que:
	* El tamaño de los vectores puede ser diferente. 
	* El vector resultado será del tamaño del mayor vector que se comparan.
	* Además, tanto el tamaño de cada vector de entrada, como los valores concretos 
	  se pedirán al usuario por teclado.
*/
package Session5;

import java.io.*;
import java.util.Scanner;

public class ArrayMayor {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); // ACTIVAMOS ESCANER
		// TRES VECTORES, DOS DE ENTRADA Y UNO DE RESULTADO
		int[] v1;
		int[] v2;
		int[] resultado;
		// VARIABLES PARA EL NUMERO DE ELEMENTOS DE LOS VECTORES
		int nelem1, nelem2, i;

		System.out.println("Longitud de primer vector: \t");
		nelem1 = leer.nextInt();
		v1 = new int[nelem1];

		System.out.println("Elementos del primer vector: ");
		for (i = 0; i < v1.length; i++) {
			v1[i] = leer.nextInt();
		}

		System.out.println("Longitud del segundo vector: \t");
		nelem2 = leer.nextInt();
		v2 = new int[nelem2];

		System.out.println("Elementos segundo vector: \t");
		for (i = 0; i < v2.length; i++) {
			v2[i] = leer.nextInt();
		}

		if (v1.length > v2.length) {
			resultado = new int[nelem1]; // inicializamos el array resultado segun la longitud de los arrays
			for (i = 0; i < resultado.length; i++) {
				// Y se procede a rellenar resultado con lo que falta, para posteriormente
				// comparar. Entonces, este relleno NO ES DEFINITIVO.
				resultado[i] = v1[i];
			}
		} else {
			resultado = new int[nelem2];
			for (i = 0; i < resultado.length; i++) {
				resultado[i] = v2[i];
			}
		}
		// AQUI ES CUANDO SE COMPARAN LOS VALORES
		if (v1.length < v2.length) {
			for (i = 0; i < v1.length; i++) {
				if (v1[i] > v2[i]) {
					resultado[i] = v1[i];
				} else {
					resultado[i] = v2[i];
				}
			}
		} else {
			for (i = 0; i < v2.length; i++) {
				if (v1[i] > v2[i]) {
					resultado[i] = v1[i];
				} else {
					resultado[i] = v2[i];
				}
			}
		}
		System.out.println("VECTOR RESULTANTE: \n ");
		System.out.print("|");
		for (i = 0; i < resultado.length; i++) {
			System.out.print(resultado[i] + "|");
		}
	}
}