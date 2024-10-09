package LabEx13Jun;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int op = 0;
		int j = 3;
		int c = 0;
		do {
			System.out.println("1.- Introducir número de jueces.");
			System.out.println("2.- Introducir número de competidores.");
			System.out.println("0.- Salir");
			System.out.println("Elige opción:");
			op = leer.nextInt();
			switch (op) {
				case 1:
					do {
						System.out.println("introduce el n�mero de jueces: ");
						j = leer.nextInt();
					} while (j < 3);
					break;
				case 2:
					System.out.println("introduce el n�mero de competidores: ");
					c = leer.nextInt();
					int[][] resultados = new int[c][j];
					generarPuntos(resultados);
					mostrarResultados(resultados);
					muestraGanador(resultados);
					break;
			}
		} while (op != 0);
		System.out.println("Introduce un n�mero: ");
		int n = leer.nextInt();
	}

	public static void generarPuntos(int[][] r) {
		for (int i = 0; i < r.length; i++)
			for (int j = 0; j < r[i].length; j++) {
				r[i][j] = (int) (Math.random() * 10) + 1;
			}
	}

	public static void mostrarResultados(int[][] r) {
		System.out.println("mostrando resultados:");
		for (int i = 0; i < r.length; i++) {
			// i+1 para que empiece por el jugador 1 en vez de 0 - RAZÓN ESTÉTICA
			System.out.print("Competidor " + (i + 1) + "\t");
			for (int j = 0; j < r[i].length; j++) {
				System.out.print(r[i][j] + "  \t");
			}
			System.out.println(notaCompetidor(r[i]));
			System.out.println();
		}

	}

	public static float notaCompetidor(int[] r) {
		float mayor = 0;
		float menor = 10;
		float suma = 0;
		for (int i = 0; i < r.length; i++) {
			if (r[i] < menor) {
				menor = r[i];
			}
			if (r[i] > mayor) {
				mayor = r[i];
			}
			suma += r[i];
		}
		suma = suma - mayor - menor;
		return (float) (suma / (r.length - 2));
	}

	public static void muestraGanador(int[][] r) {
		float notaAlta = 0;
		int ganador = 0;
		for (int i = 0; i < r.length; i++) {
			if (notaAlta < notaCompetidor(r[i])) {
				ganador = i + 1; // para que los jugadores se muestren desde 1 - RAZÓN ESTÉTICA
				notaAlta = notaCompetidor(r[i]);
			}
		}
		System.out.println("El ganador es: " + ganador);
	}
}
