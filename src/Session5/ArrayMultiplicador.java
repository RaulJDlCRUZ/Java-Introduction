/* Diseñar y codificar un programa para calcular el producto cartesiano
   de dos vectores con la siguiente especificación:
- El tamaño de los dos vectores será pedido al usuario y ambos vectores pueden 
  ser de tamaño diferente.
- Los vectores se rellenarán de forma automática con valores double aleatorios 
  entre 0 y 9,99.
- El resultado se guardará en un matriz de resultados
- El resultado se mostrará por pantalla en forma matricial.
	* La primera fila representa los valores aleatorios de uno de los vectores.
	* La primera columna son los valores del segundo valor.
	* El resto de celdas representa la multiplicación del valor de la fila por la columna 
	  correspondiente.
*/
package Session5;

import java.util.Locale;
import java.util.Scanner;

public class ArrayMultiplicador {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in); // Activamos escaner
		double[] v1;
		double[] v2;
		double[][] resultado;
		int nelem1, nelem2, i, j; // El numero de elementos de los vectores de entrada y variables de incremento

		System.out.println("\n Introduce la longitud del primer vector: \n");
		nelem1 = leer.nextInt();
		v1 = new double[nelem1]; // Asignamos al primer vector la longitud introducida por teclado
		for (i = 0; i < v1.length; i++) {
			v1[i] = Math.round((Math.random() * 10) * 100d) / 100d;
		}
		/* La asignación a v1[i] es con un número aleatorio redondeado a dos decimales:
		 * 	- Para generar numeros aleatorios usamos Math.random
		 * 	- el *10 de despues es el limite de valores, sin incluir
		 * 	- Si redondeamos a dos decimales, el valor maximo sera 9,99
		 * Luego, para redondear usamos Math.round:
		 * 	- Despues del número ((ALEATORIO)*100d)/100d
		 * 	- Cantidad de ceros oscila segun los decimales que queremos...
		 * 		- Como son dos ponemos dos ceros
		*/
		System.out.println("\n Introduce la longitud del segundo vector: \n");
		nelem2 = leer.nextInt();
		v2 = new double[nelem2]; // Asignamos al segundo vector la longitud introducida por teclado
		for (j = 0; j < v2.length; j++) {
			v2[j] = Math.round((Math.random() * 10) * 100d) / 100d;
		}
		resultado = new double[nelem1][nelem2]; // Definimos que la matriz sea de alto como v1 y de largo como v2
		for (i = 0; i < v1.length; i++) {
			// Bucles anidados para que recorra la tabla, con dos variables y los dos vectores de entrada
			for (j = 0; j < v2.length; j++) {
				// PRODUCTO CARTESIANO (A x B), y despues redondeo a dos decimales:
				resultado[i][j] = Math.round((v1[i] * v2[j]) * 100d) / 100d;
			}
		}
		System.out.print("	"); // Dejamos un poco de espacio para acomodar la tabla
		for (i = 0; i < v2.length; i++) {
			System.out.print(v2[i] + "	"); // La primera fila son los valores del segundo vector, despues dejo espacio
		}
		System.out.println(""); // Salto de linea
		for (i = 0; i < v1.length; i++) {
			System.out.print(v1[i] + "	"); // Con esto muestro las columnas, o v1
			// Hacemos una tabla dentro de la tabla de v1 y v2, para poner los valores de "resultado"
			for (j = 0; j < v2.length; j++) {
				System.out.print(resultado[i][j] + "	");
			}
			System.out.println("");
		}
	}
}