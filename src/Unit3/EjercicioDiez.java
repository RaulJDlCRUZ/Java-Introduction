/* 10. ¿Qué imprime el siguiente programa?

a) 25.0  b) -4.0  c) 1.0  d) 25
*/
package Unit3;

class EjercicioDiez {
    public static void main(String[] args) {
        int m = 5, n = 5;
        double x = (n >= m) ? (n + 2 * m / 2 * n - m) : (n + m / n - 2 * n);
        // Se cumple condición; x = (5 + 2 * 5 / 2 * 5 - 5) = 25.0 (decimal porque es double)
        System.out.println(x);
    }
}
