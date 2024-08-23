/* 13. Diseñe e implemente un programa en Java que sume dos vectores
de enteros cuyo tamaño y valores sean introducidos por teclado y que
escriba el vector resultante. si c-> = a-> + b->, los elementos de c-> se
obtienen como ci = ai + bi.
*/
package Unit3;

import java.util.Scanner;

public class SumarVectores {
    public static void main(String[] args) {
        // Declaramos las variables y escáner por consola que vayamos a necesitar
        int[] vectorA, vectorB, vectorC;
        int dimensionesVectores;
        Scanner lectura = new Scanner(System.in);

        // Pedimos por consola el tamaño de los vectores
        System.out.println("Inserte el tamaño de los vectores");

        dimensionesVectores = lectura.nextInt();
        while (dimensionesVectores < 1) {
            System.out.println("Introduce un valor positivo");
            dimensionesVectores = lectura.nextInt();
        }

        // Asignamos a los vectores las dimensiones introducidas por teclado
        vectorA = new int[dimensionesVectores];
        vectorB = new int[dimensionesVectores];
        vectorC = new int[dimensionesVectores];

        // A cada vector se le introducen los valores que deseemos
        System.out.println("Inserte los valores del vector A: ");
        for (int i = 0; i < dimensionesVectores; i++) {
            System.out.println("Posición: " + i + " valor: ");
            vectorA[i] = lectura.nextInt();
        }

        System.out.println("Inserte los valores del vector B: ");
        for (int i = 0; i < dimensionesVectores; i++) {
            System.out.println("Posición: " + i + " valor: ");
            vectorB[i] = lectura.nextInt();
        }

        for (int i = 0; i < dimensionesVectores; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println("La suma de la componente " + i + " es: " + vectorC[i]);
        }
        /*
         * Con un único bucle for recorremos los vectores A y B y sumamos las
         * componentes en su posición correspondiente, para después mostrar el resultado
         * por pantalla
         */
    }
}
