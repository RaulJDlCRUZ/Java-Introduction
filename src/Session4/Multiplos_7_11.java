/* Realiza un programa en Java para imprimir los números menores 
de 100 que sean múltiplos de 7, o sean múltiplos de 11, o de ambos.
*/
package Session4;

public class Multiplos_7_11 {
  public static void main(String[] args) {

    /*
     * Un numero entero (a) es multiplo de otro entero (b) cuando a * c = b, siendo
     * c un numero natural. Dicho de otra forma, "a" es multiplo de "b" cuando
     * a/b = c, y a%b = 0 (NO HAY RESTO)
     */

    /*
     * En los tres casos, el incremento es de 1 a 100, ya que en ese conjunto
     * de numeros se encuentran los multiplos deseados
     */

    // METODO 1: while
    System.out.println("\n RESULTADO 1: con bucle while: ");
    int i = 1;
    while (i <= 100) {
      if (i % 7 == 0 || i % 11 == 0) {
        System.out.printf(i + " ");
      }
      i++;
    }

    // METODO 2: do while
    System.out.println("\n RESULTADO 2: con bucle do - while: ");
    int j = 1;
    do {
      if (j % 7 == 0 || j % 11 == 0) {
        System.out.printf(j + " ");
      }
      j++;
    } while (j <= 100);

    // METODO 3: for
    System.out.println("\n RESULTADO 3: con bucle for: ");
    for (int k = 1; k <= 100; k++) {
      if (k % 7 == 0 || k % 11 == 0) {
        System.out.printf(k + " ");
      }
    }

  }
}