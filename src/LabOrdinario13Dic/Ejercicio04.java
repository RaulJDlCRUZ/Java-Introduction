/* 4.- Ficheros. Diseña un programa que lea por teclado hasta que indiquemos que no queremos
introducir más datos el nombre de un alumno y la nota obtenida, los datos los guardará en un
fichero de texto llamado datos.txt.

Cuando se finalice de meter alumnos en el fichero, debe indicar por pantalla el número de
alumnos introducidos, la nota media de los alumnos. Y finalmente mostrara un listado de los
alumnos que han obtenido una nota inferior a 5 y deben repetir la prueba junto con la nota
obtenida.
*/

package LabOrdinario13Dic;

import java.io.*;
import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) throws IOException {
		Scanner leer1;
		Scanner leer2;
		File fichero;
		PrintWriter salida;

		/* ESCRITURA */
		fichero = new File("datos.txt");
		leer1 = new Scanner(System.in);
		salida = new PrintWriter(new FileWriter(fichero));
		boolean masAlumnos = false;
		int total_alumnos = 0;
		int total_notas = 0;
		do {
			total_alumnos++;
			System.out.println("Introduce el nombre del alumno: ");
			String alumno = leer1.next();
			System.out.println("Introduce la nota de dicho alumno: ");
			int nota_alumno = leer1.nextInt();
			total_notas += nota_alumno;
			salida.println(alumno + ";" + nota_alumno);
			System.out.println("Introducir mas alumnos? Teclea la letra s en caso afirmativo: ");
			masAlumnos = leer1.next().equals("s");
		} while (masAlumnos);
		salida.close();
		leer1.close();
		System.out.print("[i] Has introducido " + total_alumnos + " alumnos. ");
		System.out.printf(" La nota media es: %.2f\n", total_notas / total_alumnos);

		/* LECTURA Y SUSPENSOS */
		leer2 = new Scanner(fichero);
		while (leer2.hasNext()) {
			String alumno = leer2.next();
			int localizacion_nota = 1 + alumno.indexOf(";");
			int nota = Integer.parseInt(alumno.substring(localizacion_nota));
			if (nota < 5) {
				System.out.println(alumno + " RECUPERACIÓN");
			}
		}
		leer2.close();
	}
}
