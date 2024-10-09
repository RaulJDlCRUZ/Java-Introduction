/* 10. Construir un programa que obtenga el término n de la serie de Fibonacci. El valor de n deberá 
leerse por teclado usando la clase Scanner. La serie de Fibonacci es una secuencia de enteros positivos, 
cada uno de los cuales es la suma de los dos anteriores. Los dos primeros números de la secuencia son 
0 y 1, La serie se define como:

    Fibonacci=n para n<=1
    Fibonacci_n=Fibonacci_n-1+Fibonacci_n-2 para todo n>1

El programa tendrá, además del método main, un método recursivo para calcular dicho término. El 
método main deberá llamar al método e imprimir, usando printf, el término n de la serie. Si el usuario 
introduce un valor negativo, el programa debe emitir un aviso.
*/

package Unit5;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el número n: ");
        int n = teclado.nextInt();
        long resultado = calcFib(n);
        System.out.printf("El término %d de la serie de Fibonacci es %d", n, resultado);
    }

    public static long calcFib(int n) {
        long numero = 0;
        if (n <= 1)
            numero = n;
        else {
            numero = calcFib(n - 1) + calcFib(n - 2);
        }
        return numero;
    }
}
