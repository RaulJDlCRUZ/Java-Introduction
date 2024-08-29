/*
- Generar un fichero que llamaremos numeros.dat con 2000 números 
  enteros entre 0 y 999.999.
- Leer los números del fichero numeros.dat y generar un fichero con 
  los números del fichero numeros.dat que son primos, estos 
  números se guardan en el nuevo fichero llamado primos.dat.
- Para la realización del ejercicio crea un método o función booleano 
  que le pasemos un número y devuelva true si el número es primo y 
  false en caso contrario.
*/
package Session8;

import java.io.*;
import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) throws IOException {
		Scanner leer2; // lectura del fichero
		int n;
		File fichero, fichero2;
		PrintWriter salida, salida2;
		String nombrefichero = ("numeros.dat"), nombrefichero2 = ("primos.dat");

		fichero = new File(nombrefichero);
		salida = new PrintWriter(new FileWriter(fichero));
		for (int i = 0; i < 2000; i++) {
			n = (int) (Math.random() * 1000000);
			salida.println(n);
		}
		salida.close();
		leer2 = new Scanner(fichero);
		fichero2 = new File(nombrefichero2);
		salida2 = new PrintWriter(new FileWriter(fichero2));

		while (leer2.hasNext()) {
			n = leer2.nextInt();
			boolean primo = true;
			int j = 2;
			while (j < n / 2 & primo) {
				if (n % j == 0) {
					primo = false;
				}
				j++;
			}
			if (primo && n != 4) {
				// ES PRIMO!!!
				salida2.println(n);
			}
			n++;
		}
		salida2.close();
	}
}