/*
9. Escriba un programa que genere un boleto de lotería primitiva con el número de apuestas elegido 
por el usuario. El programa hará uso del concepto de modularización, conteniendo los métodos 
necesarios para la generación del boleto. En el método main se leerá el número de apuestas con la 
clase Scanner y se imprimirá el boleto (números de cada apuesta, reintegro y precio) con printf. Un 
boleto de lotería primitiva se compone de n apuestas de 6 números enteros elegidos al azar en el 
intervalo de 1 a 49 y un reintegro elegido al azar entre 0 y 9. El coste de cada apuesta es de 1 euro.
*/

package Unit4;

import java.util.Scanner;
import java.util.Random;

class Ejercicio9 {
	public static void main(String[] args) {
		int napuestas, reintegro, numero;
		boolean existe;
		int precio = 1; // 1 euro por apuesta
		int[] apuesta;
		apuesta = new int[6];
		Scanner leer = new Scanner(System.in);
		System.out.println(" Numero de apuestas a realizar :");
		napuestas = leer.nextInt();

		// Obtencion de las n apuestas
		for (int i = 0; i < napuestas; i++) {
			System.out.println("Resultado de la apuesta " + (i + 1) + ": ");
			for (int j = 0; j <= 5; j++) {
				existe = true;
				numero = generar_numero();
				if (j != 0) {
					while (existe) {
						existe = comprobar_numero(numero, apuesta, j);
						if (existe) {
							numero = generar_numero();
						}
					}
				}
				apuesta[j] = numero;
				System.out.printf(" %2d", apuesta[j]);
			}
			System.out.println();
			/*
			 * Aqui podria venir una llamada a un metodo de ordenacion para colocar de menor
			 * a mayor los 6 numeros de cada apuesta
			 */
		} // fin for externo
// Obtencion del reintegro
		reintegro = generar_reintegro();
		System.out.println("Reintegro : " + reintegro);
// Obtencion del precio del boleto
		precio = precio * napuestas;
		System.out.println("Precio : " + precio + " euros ");
	}

	public static int generar_numero() {
		int resultado;
		resultado = ((int) (1 + 49 * Math.random()));
		return resultado;
	}

	public static boolean comprobar_numero(int valor, int[] matriz, int j) {
		boolean existe = false;
		for (int i = 0; i < j && !existe; i++) {
			if (valor == matriz[i])
				existe = true;
		}
		return existe;
	}

	public static int generar_reintegro() {
		Random rd = new Random();
// Genera un nuumero aleatorio entre 0 y 9
		return rd.nextInt(10);
	}
}