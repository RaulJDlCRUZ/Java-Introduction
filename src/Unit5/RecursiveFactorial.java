package Unit5;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int n;
        System.out.println("Recursive factorial\n");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        if (n >= 0) {
            System.out.println("The factorial of " + n + " is:");
            System.out.println(factorial(n));
        } else
            System.out.println("It cannot be computed if n<0");
    } // End main

    public static long factorial(int n) {
        long nFact;
        /* Caso Base */
        if (n == 0) {
            nFact = 1;
        } else {
            /* Caso inductivo */
            nFact = factorial(n - 1) * n;
        }
        return nFact;
    }
}
