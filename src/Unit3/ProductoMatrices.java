/* 14. Diseñe e implemente un programa en Java que calcule e imprima el producto de
dos matrices de enteros cuyos elementos y dimensiones se introduzcan por teclado.
Recuerde que dadas dos matrices A y B con dimensiones (filas x columnas)
                n x m y p x q
sólo pueden multiplicarse si m = p y siendo la matriz resultante de tamaño n x q.
Los elementos de C = A·B se obtienen como c_{i,j} = ∑ a{i,k} x b{k,j}
*/

package Unit3;

import java.util.Scanner;

public class ProductoMatrices {
    public static void main(String[] args) {
        // Declaramos las variables que vayamos a usar
        int n, m; // Filas y columnas de la matriz A
        int p, q; // Filas y columnas de la matriz B
        int[][] matrizA, matrizB, matrizC;

        // Pedir las dimensiones de las filas y columnas de las matrices A y B
        Scanner lectura = new Scanner(System.in);
        System.out.println("Inserte la dimension N de la Matriz A");
        n = lectura.nextInt();
        System.out.println("Inserte la dimension M de la Matriz A");
        m = lectura.nextInt();
        System.out.println("Inserte la dimension P de la Matriz B");
        p = lectura.nextInt();
        System.out.println("Inserte la dimension Q de la Matriz B");
        q = lectura.nextInt();

        // Dos matrices sólo se pueden multiplicar si el número de las columnas
        // de la matriz A y las filas de la matriz B coinciden
        if (m != p) {
            System.out.println("No se puede realizar la multiplicación");
            return;
        }

        // Asignamos a cada matriz sus dimensiones
        matrizA = new int[n][m];
        matrizB = new int[p][q];
        // La matriz resultado tendrá como dimensiones n (filas de A) y q (columnas de
        // B)
        matrizC = new int[n][q];

        // Introducimos en cada matriz los valores dependiendo de su posición
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.println("[Matriz A] Introduce el valor de la fila: " + i + " columna: " + j);
                matrizA[i][j] = lectura.nextInt();
            }
        }

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.println("[Matriz B] Introduce el valor de la fila: " + i + " columna: " + j);
                matrizB[i][j] = lectura.nextInt();
            }
        }

        // Mostrar los valores de las matrices introducidos por teclado...
        System.out.println("[Matriz A] ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("[Matriz B] ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        // En este bucle hacemos el sumatorio de c_{i,j} = ∑ a{i,k} x b{k,j}
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                // sumatorio se repito p-1 veces (k empieza en 0)
                for (int k = 0; k < p; k++) {
                    // Cada iteración k obtendremos los valores de la matrizA[i][k] y matrizB[k][j],
                    // y los guardamos en la matriz resultado[i][j]
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Imprimimos la matriz resultado
        System.out.println("El resultado es: ");
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
