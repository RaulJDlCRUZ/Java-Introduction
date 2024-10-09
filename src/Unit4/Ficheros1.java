/* 12. ¿Qué imprime el siguiente programa si se introduce n=4? */
package Unit4;

import java.io.*;
import java.util.Scanner;

public class Ficheros1 {
    public static void main(String[] args) throws IOException {
        Scanner sc, entrada;
        PrintWriter salida;
        int n, d, valor;
        sc = new Scanner(System.in);
        salida = new PrintWriter(new FileWriter("file1"));
        entrada = new Scanner(new FileReader("file1"));
        System.out.println("Introduzca el numero de datos a leer: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i = i + 2) {
            salida.printf(" %d", i);
            salida.println();
        }
        salida.close();
        while (entrada.hasNextInt()) {
            valor = entrada.nextInt();
            System.out.printf("%d ", valor);
        } // fin while
        entrada.close();
    } // Fin método main
}
/*
Introduzca el numero de datos a leer: 
4
0 2 4 

EN EL FICHERO file1
 0
 2
 4

*/
