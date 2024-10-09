/* 6. ¿Qué imprime el siguiente programa? */
package Unit4;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = { { 1 }, { 1, 2 }, { 1, 2, 3 } };
        cambiar(matriz);
        System.out.println(matriz[matriz.length - 1][matriz.length - 1]);
        // Resultado: 4
    }

    public static void cambiar(int[][] matriz) {
        for (int i = matriz.length - 1; i >= 0; i--)
            for (int j = matriz[i].length - 1; j >= 0; j--)
                matriz[i][j] = i + j;
    }
}

/* La matriz cambiada queda así:
0
1 2
2 3 4 <- elemento mostrado
*/