/* Escriba un programa que permita convertir de segundos a:
		días, horas, minutos y segundos.
El programa deberá solicitar el número de segundos y deberá calcular los
días, horas, minutos y segundos a los que equivale.
- Al menos debe hacer conversiones desde 0 hasta 100.000.000 de segundos.
- Ejemplo: 10.000 segundos serían: 2 horas, 46 minutos y 40 segundos.
- El programa debe realizar la lectura haciendo uso de la clase Scanner
  y la escritura a través del método printf.
*/
package Session2;

//Importamos las librerías correspondientes para que funcione correctamente el programa
import java.util.Locale;
import java.util.Scanner;

public class ConversorSegundos {

	public static void main(String[] args) {
		int segundos1, dias, horas, minutos, segundos2; // Declaramos las variables de tipo entero que vamos a usar
		Scanner leer = new Scanner(System.in);
		leer.useLocale(Locale.US); // Activamos la entrada de datos o escáner
		System.out.println("\n \t Introduzca los segundos:"); // "\t" es salto de tabulador
		segundos1 = leer.nextInt(); // El programa toma el valor de los segundos

		while (segundos1 < 0 || segundos1 > 100000000) {
			System.out.printf(
					"\n \t Error, el valor que has introducido no es correcto. Motivo: el valor no se encuentra en [0,100000000]");
			System.out.println("\n \t Intentelo de nuevo:");
			segundos1 = leer.nextInt();
		}
		/*
		 * Este bucle se encarga de que no se inicie el cálculo si el valor es
		 * incorrecto, y obliga a introducir otro valor que sea adecuado (comprendido
		 * entre 0 y 100 millones, incluidos ambos
		 */

		/*
		 * Este es el núcleo del programa. La conversión se basa en numerosas divisiones
		 * enteras y uso del resto como el dividendo de la siguiente división.
		 * Las operaciones se basan en que 1 día = 24 horas, 1 hora = 3600 segundos y 1
		 * minuto = 60 segundos.
		 */

		// 1 día = 24h * 1 hora = 3600s
		dias = segundos1 / (24 * 3600);
		// Resto de dias es el dividendo, siendo el divisor 3600 s = 1h
		horas = (segundos1 % (24 * 3600)) / (3600);
		// Resto de horas es el dividendo, el divisor es 60s= 1min
		minutos = ((segundos1 % (24 * 3600)) % (3600)) / 60;
		// Los segundos al final son el resto de la división anterior (minutos)
		segundos2 = (((segundos1 % (24 * 3600)) % (3600)) % (60));

		System.out.printf("\n RESULTADO: \n");
		System.out.printf(Locale.US, "Dias:" + dias); // Escribe el valor de la variable (dias)
		System.out.println(""); // Salto de línea, equivalente a System.out.printf("\n")
		System.out.printf(Locale.US, "Horas:" + horas);
		System.out.printf("\n");
		System.out.printf(Locale.US, "Minutos:" + minutos);
		System.out.println("");
		System.out.printf(Locale.US, "Segundos:" + segundos2);
	} // Fin del "main"
} // Fin de la clase