/* 2. ¿Qué imprime el siguiente programa? */
package Unit4;

public class EjercicioDos {
    public static void main(String[] args) {
        int[] matriz1 = { 9, 1, 3, 5 };
        int[] matriz2 = matriz1; // Esto implica que son dos objetos con la MISMA referencia.
        matriz2[3] = 4;
        matriz1[1] = 3;
        metodo1(matriz1, matriz2);
        System.out.print(matriz1[1] + " " + matriz2[2] + " ");
        // Resultado: 7 3
    }// fin main

    public static void metodo1(int[] m1, int[] m2) {
        // Al pasar arrays directamente, los cambios se mantienen, ya que pasamos una copia de la referencia de los objetos
        m1[1] = 4;
        m2[1] = m1[3] + m2[2];
    }// fin metodo1
}

/*
Lo que cambie en matriz1 se cambia en matriz2 y viceversa:
{ 9, 1, 3, 5 }
{ 9, 1, 3, 4 } // matriz2[3] = 4;
{ 9, 3, 3, 4 } // matriz1[1] = 3;
{ 9, 7, 3, 4 } // metodo1(matriz1, matriz2);
*/