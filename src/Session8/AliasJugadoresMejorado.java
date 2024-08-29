/*
Se pide modificar el ejemplo del programa de escritura/lectura de 
un fichero secuencial para:  Escribir alias de jugadores.
Para cada alias el programa genera una puntuación.
- La puntuación será un valor entero generado aleatoriamente (0 – 999999)
- Cada línea del fichero contendrá un par alias;puntuación
	Pepe;1234
	María;4567
	...
- Leer las parejas de valores alias;puntación y mostrarlas por pantalla de la forma:
	>Pepe = 1234
	>María = 4567
- Indicar Cual de los alias introducidos en el fichero tiene la puntuación más alta.
*/
package Session8;

import java.io.*;
import java.util.Scanner;

public class AliasJugadoresMejorado {
	public static void main(String[] args) throws IOException {
		Scanner leer1 = new Scanner(System.in); // teclado
		Scanner leer2; // lectura del fichero
		File fichero;
		String nfile;
		PrintWriter salida;
		String alias, aliasMaximo = "";
		int n, maximo = -1; // n sera el numero aleatorio de las puntuaciones de los alias

		/* PRIMERA PARTE: ESCRITURA DEL FICHERO: */

		System.out.println("Introduzca el nombre del fichero");
		nfile = leer1.next(); // nombre del fichero por teclado
		fichero = new File(nfile); // fichero con nombre nfile (del teclado)
		salida = new PrintWriter(new FileWriter(fichero)); // activamos escritura del fichero
		boolean masAlias = false;
		do {
			System.out.print("\nIntroduzca un alias de jugador: ");
			alias = leer1.next();
			n = (int) (Math.random() * 1000000);
			salida.println(alias + ";" + n);
			System.out.print("Introducir más alias? (s/n) ");
			masAlias = leer1.next().equals("s");
		} while (masAlias);
		salida.close();
		leer1.close();

		/* SEGUNDA PARTE: LECTURA DEL FICHERO */
		leer2 = new Scanner(fichero); // se prodece a activar el lector del fichero
		int actual = 0;
		String[] aliasPuntuacion;
		while (leer2.hasNext()) {
			alias = leer2.next();
			System.out.println("> " + alias);
			/* TERCERA PARTE: BUSCAR EL ALIAS CON LA PUNTUACION MAS ALTA */
			aliasPuntuacion = alias.split(";"); // separa el alias de la puntuacion
			actual = Integer.parseInt(aliasPuntuacion[1]);
			if (actual > maximo) {
				maximo = actual;
				aliasMaximo = aliasPuntuacion[0];
			}
		}
		leer2.close();
		System.out.println("El alias con la puntuación más alta es: " + aliasMaximo + " con " + maximo);
	}
}