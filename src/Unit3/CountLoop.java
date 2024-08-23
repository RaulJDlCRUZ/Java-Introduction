/* 9. ¿Qué hay incorrecto en el siguiente fragmento de código?
      Indique tres formas de solucionar el problema.
*/
package Unit3;

class CountLoop {
    public static void main(String[] args) {
        int count;

        // Código original e incorrecto (ASUMO QUE LA VARIABLE YA EXISTÍA)
        
        /*
        count = 50;
        while (count >= 0) {
            System.out.println(count);
            count = count + 1; // Error: el valor de count nunca disminuye = Bucle infinito
        }
        */
        
        // Solución 1: Cambiar el operador de decremento a incremento (cuenta regresiva)
        count = 50;
        while (count >= 0) {
            System.out.println(count);
            count = count - 1;
            // ó count--;
        }

        // Solución 2: Empezar desde cero hasta 50 (cuenta progresiva)
        count = 0;
        while (count <= 50) {
            System.out.println(count);
            count = count + 1;
            // ó count++;
        }
    }
}
