/* 7. ¿Qué imprime el siguiente programa? */
package Unit3;

class EjercicioSiete {
    public static void main(String[] args) {
        int var = 1;
        int m = 1;
        boolean x = true;
        do {
            if (!x) {
                var = 2;
            }
            do {
                m++;
            } while (m < 3);
            x = false;
        } while (var != 2);
        System.out.println(m); // 4
    }
}
