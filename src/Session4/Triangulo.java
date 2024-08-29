/* Escribir un programa en Java que lea un número entero y muestre por pantalla
un triángulo rectángulo como el de más abajo, de altura el número introducido.
*/
package Session4;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		int i;
		int j = 1;
		Scanner leer = new Scanner(System.in);
		leer.useLocale(Locale.US);
		System.out.println("Introduce el numero entero: \n");
		int n = leer.nextInt(); // n es el numero de asteriscos de altura/lado

		// "Bucle en 2 dimensiones, i y j". i son saltos de linea, y j asteriscos
		for (i = 1; i <= n; i++) {
			// j<=i ya que hay mismos saltos de linea que asteriscos
			// (+1 ya que el bucle empieza en 1)
			for (j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
}