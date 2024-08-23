/*
11. ¿Qué imprime el siguiente programa si se lee por teclado el valor de 5?
a) 00000  b) 12321  c) 01210  d) Error: la sentencia a[i] = a[a[i]]; es incorrecta
*/
package Unit3;

import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tam = leer.nextInt();
        int[] a = new int[tam];
        for (int i = 0; i < tam; i++)
            a[i] = 4 - i;
        for (int i = 0; i < tam; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < tam; i++)
            System.out.print(a[i]); // 01210
    }// fin main
}// fin clase EjercicioOnce

/*
 * Explicación
 * 
 * Para cuando se sabe que tam = 5:
 * a = [4, 3, 2, 1, 0] // Se llena el arreglo con 4 - i
 * Luego con la sentencia a[i] = a[a[i]] se complica un poco
 * porque se busca al elemento en a del contenido de a[i]
 * 
 *    a[0] = a[a[0]] = a[4] = 0
 *    a[1] = a[a[1]] = a[3] = 1
 *    a[2] = a[a[2]] = a[2] = 2
 *    a[3] = a[a[3]] = a[1] = 1 y no 3 (RECIÉN MODIFICADO)
 *    a[4] = a[a[4]] = a[0] = 0 y no 4 (RECIÉN MODIFICADO)
 * 
 * Por lo tanto: 01210
 */