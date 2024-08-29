/*
Escriba un programa que genere un boleto de lotería primitiva con el número de apuestas elegido por el usuario. 
- El programa hará uso del concepto de modularización, conteniendo 
  los métodos necesarios para la generación del boleto. 
- En el método main se leerá el número de apuestas con la clase 
  Scanner y se imprimirá el boleto (números de cada apuesta, 
  reintegro y precio) con printf. 
- Un boleto de lotería primitiva se compone de n apuestas de 6 
  números enteros elegidos al azar en el intervalo de 1 a 49 y un
  reintegro elegido al azar entre 0 y 9. 
- El coste de cada apuesta es de 1 euro.
*/
package Session7;

import java.util.*;

public class Primitiva {
	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		// Leemos el n�mero de apuestas.
		System.out.println("Introduce el n�mero de apuestas: ");
		int napuestas = TECLADO.nextInt();

		// Leemos el numero de apuestas que queremos generar
		for (int i = 0; i < napuestas; i++) {
			genera_apuesta();
		}

		// Generamos el reintegro
		int r = genera_reintegro();
		System.out.println("El reintegro del sorteo es el " + r);
		System.out.println("El coste del boleto es de " + napuestas + "euros");
	}

	public static void genera_apuesta() {
		int[] boleto = new int[6];
		int i = 0;
		int n;
		boolean repetido = false;
		while (i < 6) {
			n = (int) (Math.random() * 49 + 1);
			repetido = false;
			for (int j = 0; j < i; j++) {
				if (boleto[j] == n) {
					repetido = true;
				}
			}
			if (!repetido) {
				boleto[i] = n;
				i++;
			}
		}
		// El sorteo se imprime ordenado
		Arrays.sort(boleto);
		System.out.print("Sorteo: ");
		for (int j = 0; j < 6; j++) {
			System.out.printf("%4d", boleto[j]);
		}
		System.out.println();

	}

	public static int genera_reintegro() {
		int reintegro;
		Random generador = new Random();
		reintegro = generador.nextInt(9);
		return reintegro;
	}

}
