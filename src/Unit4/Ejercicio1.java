/* 4. ¿Cuál es el resultado del siguiente programa? */
package Unit4;

public class Ejercicio1 {
    public static void main(String[] args) {
        char[] matriz1 = { 'c', 'a', 's', 'a' }, matriz2 = null;
        String cadena = "oeoe ";
        matriz1[3] = cadena.charAt(1);
        metodo1(matriz2, matriz1);
        System.out.println(matriz1); // Resultado: tase
    }// fin main

    public static void metodo1(char[] m1, char[] m2) {
        String cadena = "ptpt";
        m1 = m2; // La referencia de m1 es la misma que m2 (ahora son el MISMO objeto)
        m1[0] = cadena.charAt(1);
    }// fin metodo1
}// fin clase Ejercicio1