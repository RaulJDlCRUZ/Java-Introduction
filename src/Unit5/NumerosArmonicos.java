/* 2. El número armónico de orden n (Hn) es la suma de los recíprocos de los n primeros números 
naturales:

Hn = 1/1 + 1/2 + 1/3 + ... + 1/n = \sum_{k=1}^{n}{1/k}

Escriba un método recursivo que calcule el número armónico de orden n. A continuación, escriba un 
programa en Java que solicite por teclado el orden, n, de un número armónico, calcule este último 
(haciendo uso del método recursivo previamente implementado) y lo imprima con cuatro decimales 
de precisión. Para ello, el programa deberá comprobar que el valor n introducido cumple que n >= 1. Si 
no es así el programa dará un mensaje de aviso.
*/
package Unit5;

import java.util.Scanner;

public class NumerosArmonicos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el orden n: ");
        int n = teclado.nextInt();
        if (!(n >= 1)) {
            System.err.println("El orden debe ser mayor o igual a 1");
            System.exit(-1);
        }
        double resultado = armonico(n);
        System.out.printf("H_%d = %.4f", n, resultado);
    }

    public static double armonico(int k) {
        double valor = 0;
        if (k >= 1) {
            double fraccion = (double) 1 / (double) k;
            valor = fraccion + armonico(k - 1);
        }
        return valor;
    }
}
