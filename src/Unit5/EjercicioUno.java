/* 1. ¿Qué valor devolverá el método restados si invocamos al método con restados (5)? ¿Y si le pasamos 6? */
package Unit5;

public class EjercicioUno {
    public static void main(String[] args) {
        /* Con 5 el programa nunca acabará: 5 -> 3 -> 1 -> -1 ... NO PASA POR EL CASO BASE */
        // restados(5);
        /* Con 6, devolverá 10: 6 + 4 + 0 (caso base) */
        System.out.println(restados(6));
    }
    public static int restados(int n) {
        int valor = 0;
        if (n == 2) {
            valor = 0;
        } else {
            valor = n + restados(n - 2);
        }
        return valor;
    }
}
