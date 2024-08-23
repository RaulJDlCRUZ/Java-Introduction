/* 2. ¿Cuál es el resultado del siguiente programa?

  a) 4,22  b) 4,2  c) 5,2  d) 5,22
*/
package Unit3;

class EjercicioDos {
    public static void main(String[] args) {
        double a = 3.22;
        int i = 0, j = 0;
        while (i < 2) {
            if ((a / 2 != 0) || (j / 2) == 0) {
                i++;
                a++;
            }
        }
        do {
            j++;
            a--;
        } while (j < 1);
        System.out.printf("%.1f", a);
        // El resultado es 4,2
    } // fin main
} // fin clase