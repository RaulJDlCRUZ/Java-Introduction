/*
Construir un programa pida dos números por teclado.
Y muestre por pantalla los números pares comprendidos entre los dos números y su suma.
- El valor de Número 1 y Número 2 deberá leerse por teclado usando la clase Scanner.
- El programa debe iterar desde el número menor al mayor e imprimir los números pares.
- El programa almacenará la suma de los números pares. 
- El programa después de la última iteración mostrará el resultado de la suma de los números pares. 
*/
package Session3;

import java.util.Locale;
import java.util.Scanner; //Importamos las librerías necesarias

public class NumerosPares {
	public static void main(String[] args) {
		// Declaramos variables de tipo entero
		int n1, n2, i, j;
		// Por ahora la suma total no tendrá ningún contenido, así que le asignamos el valor 0
		int sumtot = 0;
		Scanner leer = new Scanner(System.in);
		leer.useLocale(Locale.US); // Activamos el escáner
		System.out.println("Teclea el primer numero: ");
		n1 = leer.nextInt();
		System.out.println("Teclea el segundo numero: ");
		n2 = leer.nextInt();
		/*
		Con esto discriminaremos entre números pares e impares
		ya que si n1 se divide /2 y tiene resto no nulo, es impar
		*/
		j = (n1 % 2);
		// SI ES IMPAR...
		if (j != 0) {
			// El incremento o bucle se iniciará con un par
			n1 = n1 + 1;
			i = n1;
			if (n2 - n1 <= 2) {
				// Si los 2 numeros están demasiado juntos y no hay un par entre medias,
				// no se iniciará el bucle
				System.out.println("No hay numeros pares entre medias.");
				System.exit(0); // Cierra el programa forzosamente
			}
			for (i = n1; i < n2; i = i + 2) {
				System.out.printf(" " + i);
				sumtot = sumtot + i;
			}
			System.out.println("\n La suma total es: " + sumtot);
			System.exit(0);

		}
		// SI ES PAR...
		if (j == 0) {
			i = n1;
			if (n2 - n1 <= 2) {
				System.out.println("No hay numeros pares entre medias.");
				System.exit(0);
			}
			/*
			En este FOR ponemos de inicialización +2 porque queremos que empiece a
			escribir el par después del introducido por el escáner
			*/
			for (i = n1 + 2; i < n2; i = i + 2) {
				System.out.printf(" " + i);
				sumtot = sumtot + i;
			}
			System.out.println(" \n La suma total es: " + sumtot);
			System.exit(0);
		}
	} // Fin del main
} // Fin de la clase