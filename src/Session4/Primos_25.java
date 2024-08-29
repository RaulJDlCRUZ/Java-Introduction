/* Realizar un programa en Java que muestre por pantalla los 25 primeros números primos. */
package Session4;

public class Primos_25 {
	public static void main(String[] args) {
		// Constantes del programa: el contador de primos y la lista de numeros a probar son 1.
		int num = 1;
		int contadorprimos = 1;
		do {
			// Suponemos que la variable centinela es verdadera => Suponemos que "num" es primo
			boolean primo = true;
			int i = 2;
			while (i < num / 2 & primo) {
				// La i aumenta para encontrar un posible multiplo,
				// ya que este numero entre el multiplo, el resto es cero; no es primo
				if (num % i == 0) {
					primo = false;
				}
				i++;
			}
			if (primo && num != 4) { // Excluimos el 4 al ser 2 < 4/2
				System.out.printf(" " + num); // Si es primo, se escribe, y luego el contador aumenta hasta 25
				contadorprimos++;
			}
			num++;
		} while (contadorprimos <= 25);
	}
}