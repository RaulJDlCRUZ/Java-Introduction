/* 2. Suponga que b es una variable lógica (boolean)
¿Cuál es el resultado de las siguientes expresiones?
  a) b==true  
  b) b=true
*/
package Unit2;

public class Booleanos {
    public static void main(String args[]) {
        boolean b = false;
        // Dos iguales
        System.out.println(b == true); // Imprime el resultado de la comparación de los valores booleanos
                                       // En este caso: false
        // Un igual
        System.out.println(b = true); // Como tal esto no devuelve nada, simplemente es una asignación.
                                      // Pero esta sentencia imprime: true
    }
}