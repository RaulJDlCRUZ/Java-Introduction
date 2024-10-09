/* 5. ¿Cuál es el resultado del siguiente programa? */
package Unit4;

public class EjercicioCinco {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5 };
        int[] b = a;
        b[1] = 3;
        a = metodo1(a, b);
        /*
        Sólo se reemplaza "a" y no "b" porque la referencia "b" todavía apunta a {3, 4, 5}
        Sin embargo, "a" ahora apunta al espacio de "c", {6, 8, 10}
        */
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " " + b[i] + " ");
        // Resultado: 6 3 8 4 10 5
    }

    public static int[] metodo1(int[] d, int[] e) {
        e[1] = 4;
        int[] c = { 0, 0, 0 };
        for (int i = 0; i < d.length; i++)
            c[i] = d[i] + e[i];
        return c;
    } // fin main
}
