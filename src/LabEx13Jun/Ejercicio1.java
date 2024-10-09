/* 1. Crearemos la clase Ejercicio1. Será un programa que realizará las siguientes acciones:
    a. Pedirá dos número N y M y llamará a una función que generará una matriz de N filas y
       M columnas, formada por números enteros (o float) comprendidos entre 0 y 1. (1 punto)
    b. Luego llamará a la función mostrarMatriz que la mostrará por pantalla (1 punto)
    c. Finalmente llamará a la función sumaComponentes que devolverá la suma de los todos
       los elementos de la matriz. (1 punto).
*/
package LabEx13Jun;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el número de filas: ");
        int N = leer.nextInt();
        System.out.println("Introduce el número de columnas: ");
        int M = leer.nextInt();
        float[][] matriz = new float[N][M];
        generarNumeros(matriz, N, M);
        mostrarMatriz(matriz, N, M);
        float suma = sumaComponentes(matriz, N, M);
        System.out.printf("La suma de los elementos de la matriz es %f\n", suma);
    }

    public static void generarNumeros(float[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (float) Math.random();
            }
        }
    }

    public static void mostrarMatriz(float[][] matriz, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static float sumaComponentes(float[][] matriz, int filas, int columnas) {
        float suma = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
