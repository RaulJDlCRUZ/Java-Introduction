/* 3. ¿Qué imprime el siguiente programa?
    a) 01 01
    b) -10 -10
    c) 01 -10
    d) Error: En el bucle sobre j que hay en el método main debería poner j<matriz[i].length
*/
package Unit4;

public class EjercicioTres {
    public static void main(String[] args) {
        int dimension = 2;
        int[][] matriz = metodo(dimension);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                // La d) no es correcta porque matriz[0] es otra matriz unidimensional, de length=2
                System.out.print(matriz[i][j]);
            }
            System.out.print(" ");
            // Imprime 01 -10
        }
    }// fin main

    public static int[][] metodo(int dimension) {
        int[][] matriz1 = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz1[i][j] = j - i;
            }
        }
        /* Va a devolver 01 -10 */
        return matriz1;
    } // fin metodo
}
