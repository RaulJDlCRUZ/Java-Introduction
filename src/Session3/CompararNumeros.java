package Session3;

import java.util.Scanner;

public class CompararNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un valor para a: ");
		a = leer.nextInt();
		System.out.println("Introduce un valor para b: ");
		b = leer.nextInt();
		if (a > b) {
			System.out.println(a + " es mayor que " + b);
		} else {
			if (a < b) {
				System.out.println(a + " es menor que " + b);
			} else {
				System.out.println(" Son iguales y su valor es " + b);
			}
		}
		System.out.println("Los valores de a y b son " + a + " y " + b);
	}
}
