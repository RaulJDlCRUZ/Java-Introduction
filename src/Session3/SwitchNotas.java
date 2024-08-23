package Session3;

import java.util.Scanner;

public class SwitchNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la nota del examen: ");
		nota = leer.nextInt();
		switch (nota) {
			case 1:
				System.out.println("La nota obtenida es Insuficiente (" + nota + ")");
				break;
			case 2:
				System.out.println("La nota obtenida es Insuficiente (" + nota + ")");
				break;
			case 3:
				System.out.println("La nota obtenida es Insuficiente (" + nota + ")");
				break;
			case 4:
				System.out.println("La nota obtenida es Insuficiente (" + nota + ")");
				break;
			case 5:
				System.out.println("La nota obtenida es Suficiente (" + nota + ")");
				break;
			case 6:
				System.out.println("La nota obtenida es Bien (" + nota + ")");
				break;
			case 7:
				System.out.println("La nota obtenida es Notable (" + nota + ")");
				break;
			case 8:
				System.out.println("La nota obtenida es Notable (" + nota + ")");
				break;
			case 9:
				System.out.println("La nota obtenida es Sobresaliente (" + nota + ")");
				break;
			case 10:
				System.out.println("La nota obtenida es Matr�cula de Honor (" + nota + ")");
				break;
			default:
				System.out.println("La nota introducida no es v�lida (" + nota + ")");

		}

	}

}
