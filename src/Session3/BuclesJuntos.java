package Session3;

import java.util.Scanner;

public class BuclesJuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime hasta que n�mero quieres sumar: ");
		num = leer.nextInt();
		// Bucle while
		int suma = 0;
		int cont = 1;
		while (cont <= num) {
			suma = suma + cont;
			cont = cont + 1;
		}
		System.out.println("[WHILE] La suma de los " + num + " primeros números es " + suma);
		// Bucle do-while
		suma = 0;
		cont = 1;
		do {
			suma += cont;
			cont++;
		} while (cont <= num);
		System.out.println("[DO-WHILE] La suma de los " + num + " primeros números es " + suma);
		// Bucle for
		suma = 0;
		for (int i = 1; i <= num; i++) {
			suma = suma + i;
		}
		System.out.println("[FOR-LOOP] La suma de los " + num + " primeros números es " + suma);
	}
}
