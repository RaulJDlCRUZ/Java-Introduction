package Session3;

import java.util.Scanner;

public class ElseIfNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la nota del examen: ");
		nota = leer.nextInt();
		if (nota == 1) {
			System.out.println("La nota que has sacado es Insuficiente (" + nota + ")");
		} else if (nota == 2) {
			System.out.println("La nota que has sacado es Insuficiente (" + nota + ")");
		} else if (nota == 3) {
			System.out.println("La nota que has sacado es Insuficiente (" + nota + ")");
		} else if (nota == 4) {
			System.out.println("La nota que has sacado es Insuficiente (" + nota + ")");
		} else if (nota == 5) {
			System.out.println("La nota que has sacado es Suficiente (" + nota + ")");
		} else if (nota == 6) {
			System.out.println("La nota que has sacado es Bien (" + nota + ")");
		} else if (nota == 7) {
			System.out.println("La nota que has sacado es Notable (" + nota + ")");
		} else if (nota == 8) {
			System.out.println("La nota que has sacado es Notable (" + nota + ")");
		} else if (nota == 9) {
			System.out.println("La nota que has sacado es Sobresaliente (" + nota + ")");
		} else if (nota == 10) {
			System.out.println("La nota que has sacado es Matr�cula de Honor (" + nota + ")");
		} else {
			System.out.println("La nota introducida no es v�lida.");
		}
	}

}
