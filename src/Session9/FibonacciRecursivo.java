/*
Construir un programa que obtenga el término n de la serie de Fibonacci.
El valor de n deberá leerse por teclado usando la clase Scanner.
La serie de Fibonacci es una secuencia de enteros positivos,
cada uno de los cuales es la suma de los dos anteriores.
Los dos primeros números de la secuencia son 0 y 1.
La serie se define como:

- Fibonacci=n para n<=1
- Fibonaccin=Fibonaccin-1+Fibonaccin-2 para todo n>1 

El programa tendrá, además del método main, un método recursivo para
calcular dicho término. El método main deberá llamar al método e
imprimir, usando printf, el término n de la serie. Si el usuario
introduce un valor negativo, el programa debe emitir un aviso.
*/
package Session9;

import java.io.*;
import java.util.Scanner;

public class FibonacciRecursivo {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Determina el termino que se desee mostrar de la Sucesion de Fibonacci: ");
		int n = leer.nextInt();
		if (n < 0) {
			System.out.println("ERROR. EL VALOR N ES NEGATIVO");
			System.exit(0);
		}
		int fib = SucesionF(n);
		System.out.println("El termino " + n + " de la Sucesion de Fibonacci es " + fib);
	}

	public static int SucesionF(int n) {
		int valor;
		if (n <= 1) {
			valor = n;
		} else {
			valor = SucesionF(n - 1) + SucesionF(n - 2);
		}
		return valor;
	}

}