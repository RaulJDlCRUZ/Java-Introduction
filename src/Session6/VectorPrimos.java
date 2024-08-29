package Session6;

import java.util.Scanner;

/* Un programa que lea del teclado un n�mero entero, y lo descomponga en sus vectores primos
 * de manera que lo introduzca en un array bidimensional de la siguiente manera:
 * 
 * 360 = 2 x 2 x 2 x 3 x 3 x 5 = 23 x 32 x 5
 * El algoritmo que dise�emos debe introducir el resultado en un vector con un formato parecido
 * a:
 * 
 * vectorResultado = {{2,3},{3,2},{5,1}}
 * El programa debe producir como salida:
 * 360 = 2^3 x 3^2 x 5
 */

public class VectorPrimos {

	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un n�mero: ");
		int num = TECLADO.nextInt();
		int x = num;
		int[][] factores = new int[10][2];
		int tope = 0;
		int exp;
		for (int i = 2; i <= x; i++) {
			exp = 0;
			if ((x % i == 0) & (x > 1)) {
				while (x % i == 0) {
					x /= i;
					exp++;
				}
				factores[tope][0] = i;
				factores[tope][1] = exp;
				tope++;
			}

		}
		System.out.println("El número " + num + " se descompone en los siguientes factores");
		System.out.print(num + " = ");

		for (int i = 0; i < tope; i++) {
			System.out.print(factores[i][0] + "^" + factores[i][1]);
			if (i == tope - 1) {
				System.out.print("");
			} else {
				System.out.print(" * ");
			}
		}

	}

}
