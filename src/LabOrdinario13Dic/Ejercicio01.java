/*
1.- Realiza un programa en JAVA (class Ejercicio01) que lea dos números enteros por teclado e
imprima todos los múltiplos de 5 que hay entre los dos números en orden ascendente. (2
punto).
*/

package LabOrdinario13Dic;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		int a, b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		a = leer.nextInt();
		System.out.println("Introduce el segundo numero: ");
		b = leer.nextInt();
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a + 1; i <= b; i++) { // empiezo por a +1 ya que el de teclado no cuenta
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		leer.close();
	}
}
