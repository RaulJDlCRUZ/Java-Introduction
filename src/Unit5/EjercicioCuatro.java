/* 4. ¿Cuál es el resultado del siguiente programa? */
package Unit5;

public class EjercicioCuatro {
    public static void main(String[] args) {
        metodoA(3);
        // Resultado: LibroRevistaRevistaRevista
    }

    public static void metodoA(int n) {
        if (n < 1) {
            System.out.print("Libro");
        } else {
            metodoA(n - 1);
            System.out.print("Revista");
        }
    }
}
