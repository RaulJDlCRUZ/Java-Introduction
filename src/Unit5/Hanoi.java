/* 5. Desarrolle un programa con un método recursivo que solucione el problema de las torres de Hanoi 
para un número arbitrario de discos. El programa debe imprimir la secuencia precisa de transferencia 
de los n discos de una varilla a otra.
*/
package Unit5;

import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de discos: ");
        int n = teclado.nextInt();
        resolverHanoi(n, 'A', 'B', 'C');
    }

    public static void resolverHanoi(int n, char origen, char destino, char auxiliar) {

        if (n == 1) {
            // Si solo hay un disco, se mueve directamente del origen al destino
            System.out.println("Mover disco " + n + " de la varilla " + origen + " a la varilla " + destino);
        } else {   
            /* Temporalmente moverá n-1 discos de origen a la auxiliar, y el que queda, a destino.
            Después, deshago los cambios */
            resolverHanoi(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de la varilla " + origen + " a la varilla " + destino);
            resolverHanoi(n - 1, auxiliar, destino, origen);
        }
    }
}