/* Realizar una calculadora que muestre un menú con las siguientes opciones:
MENU: 
	1) Sumar. 
	2) Restar. 
	3) Multiplicar. 
	4) División entera y módulo. 
	0) Salir. 
Tras indicar la operación pedirá los dos operandos y mostrará el resultado obtenido, volviendo 
a presentar el menú. Lo estará repitiendo hasta que introduzcamos un cero para indicar la 
operación. Debemos decidir la operación que vamos a seleccionar usando la instrucción switch 
case.
*/
package Session6;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int op = 1;
		int ope1 = 0, ope2 = 0;
		while (op != 0) {
			System.out.println(
					"MENU: \n1) Sumar. \n2) Restar. \n3) Multiplicar. \n4) División entera y módulo. \n0) Salir.");
			op = leer.nextInt();
			if (op >= 1 & op <= 4) {
				System.out.println("Introduce el primer operando: ");
				ope1 = leer.nextInt();
				System.out.println("Introduce el segundo operando: ");
				ope2 = leer.nextInt();
			}
			switch (op) {
				case 0:
					System.out.println("Cerrando calculadora...");
					break;
				case 1:
					System.out.println(ope1 + " + " + ope2 + " = " + (ope1 + ope2));
					break;
				case 2:
					System.out.println(ope1 + " - " + ope2 + " = " + (ope1 - ope2));
					break;
				case 3:
					System.out.println(ope1 + " x " + ope2 + " = " + (ope1 * ope2));
					break;
				case 4:
					System.out.println(ope1 + " / " + ope2 + " = " + (ope1 / ope2));
					System.out.println(ope1 + " % " + ope2 + " = " + (ope1 % ope2));
					break;
				default:
					System.out.println("Error. Opción incorrecta.");
					break;
			}
		}
	}

}
