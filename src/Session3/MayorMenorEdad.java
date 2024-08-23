package Session3;

import java.util.Scanner;

public class MayorMenorEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		int edad;
		edad = leer.nextInt();
		if (edad < 18) {
			System.out.println("Es menor de edad.");
		} else {
			System.out.println("Es mayor de edad.");
		}
		System.out.println("Fin del programa");
	}

}
