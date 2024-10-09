/* 3. ¿Cuál es el resultado del siguiente programa? */
package Unit5;

public class EjercicioTres {
    public static void main(String[] args) {
        metodo1(4);
        // Resultado: XOOO 1-2-3-4
    }

    public static void metodo1(int n) {
        if (n < 2)
            System.out.print('X');
        else {
            metodo1(n - 1);
            System.out.print('O');
        }
    }
}