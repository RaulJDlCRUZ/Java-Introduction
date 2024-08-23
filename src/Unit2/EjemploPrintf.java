package Unit2;
import java.util.Locale;
import java.util.Scanner;

public class EjemploPrintf {

	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TECLADO.useLocale(Locale.US);
		System.out.println("Introduzca un número real (double)");
		double real = TECLADO.nextDouble();
		System.out.println("Introduzca un número entero (int)");
		int entero = TECLADO.nextInt();

		System.out.println("El número real introducido se puede escribir así: " + real);
		System.out.println("El número entero introducido se puede escribir así: " + entero);
		System.out.println();
		System.out.println("-------------Ahora con formato usando printf---------------");
		System.out.printf("El número real introducido se puede escribir así:" +
				"\nNumReal: %7.4f" +
				"\nNumReal: %7.3f" +
				"\nNumReal: %7.2e\n", real, real, real);

		System.out.printf("El número entero introducido se puede escribir así:" +
				"\nNumEntero: %d\n" +
				"\nNumEntero: %5d\n", entero, entero);
	}

}