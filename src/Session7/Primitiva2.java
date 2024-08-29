/* Programa de la primitiva con mejoras de modularización */
package Session7;

import java.util.*;

public class Primitiva2 {
	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		// Leemos el n�mero de apuestas.
		System.out.println("Introduce el n�mero de apuestas: ");
		int napuestas = TECLADO.nextInt();
		// Leemos el numero de apuestas que queremos generar
		genera_apuesta(napuestas);
		// Generamos el reintegro
		genera_reintegro();
		System.out.println("El coste del boleto es de " + napuestas + "�");
	}

	public static void genera_apuesta(int na) {

		for (int i = 1; i <= na; i++) {
			int[] boleto = new int[6];
			boleto = nuevoBoleto();
			System.out.println("Apuesta " + i + ": ");
			imprimirBoleto(boleto);
		}

	}

	public static int[] nuevoBoleto() {
		int[] bol = new int[6];
		int i = 0;
		int n;
		boolean repetido = false;
		while (i < 6) {
			n = (int) (Math.random() * 49 + 1);
			repetido = false;
			for (int j = 0; j < i; j++) {
				if (bol[j] == n) {
					repetido = true;
				}
			}
			if (!repetido) {
				bol[i] = n;
				i++;
			}
		}
		Arrays.sort(bol);
		return bol;
	}

	public static void imprimirBoleto(int[] bol) {
		for (int j = 0; j < 6; j++) {
			System.out.printf("%4d", bol[j]);
		}
		System.out.println();

	}

	public static void genera_reintegro() {
		int reintegro;
		Random generador = new Random();
		reintegro = generador.nextInt(9);
		System.out.println("El reintegro del sorteo es el " + reintegro);
	}

}
