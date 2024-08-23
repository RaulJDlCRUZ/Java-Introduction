/* 6. ¿Cuál es el resultado de este programa?  ¿Y si la variable a fuera par? */
package Unit3;

class EjercicioSeis {
    public static void main(String[] args) {
        int a = 3;
        int n = 10;
        int cont = 0;
        for (int var = 0; var < n; var++) {
            if ((a % 2 == 0) || (var % 2) == 0) {
                cont++;
            }
        }
        System.out.printf("%d", cont);
    }
}