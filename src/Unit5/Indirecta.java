/* 8. ¿Cuál es la salida del siguiente programa? ¿Y si n vale 5? */
package Unit5;

public class Indirecta {
    public static void main(String[] args) {
        int n = 5;
        m1(n);
    }

    public static void m1(int n) {
        // El caso base es n=0

        if (n == 0) {
            System.out.println("En m1 con N: " + n + "\n");
        } else { // Caso inductivo
            m2(n);
            System.out.println("En m1 despues de la llamada recursiva a m1: " + n);
        }
    }

    public static void m2(int n) {
        System.out.println("En m2 con N: " + n);
        m3(n - 1);
        System.out.println("En m2 despues de la llamada recursiva a m1: " + n);
    }

    public static void m3(int n) {
        System.out.println("En m3 con N: " + n);
        m1(n - 1);
        System.out.println("En m3 despues de la llamada recursiva a m1: " + n);
    }

}

/*
En m2 con N: 6
En m3 con N: 5
En m2 con N: 4
En m3 con N: 3
En m2 con N: 2
En m3 con N: 1
En m1 con N: 0

En m3 despues de la llamada recursiva a m1: 1
En m2 despues de la llamada recursiva a m1: 2
En m1 despues de la llamada recursiva a m1: 2
En m3 despues de la llamada recursiva a m1: 3
En m2 despues de la llamada recursiva a m1: 4
En m1 despues de la llamada recursiva a m1: 4
En m3 despues de la llamada recursiva a m1: 5
En m2 despues de la llamada recursiva a m1: 6
En m1 despues de la llamada recursiva a m1: 6

N = 5 EL PROGRAMA NO SE DETIENE
*/

