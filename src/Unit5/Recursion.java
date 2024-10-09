/* 12. ¿Qué imprime el siguiente programa?
    a) 2
    b) 0
    c) Nada porque se produce un error: Recursividad infinita
    d) -2
*/

package Unit5;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(metodo(5));
    }

    public static int metodo(int n) {
        int resultado = 2;
        if (n != 4) { // Con el valor n=5, esto siempre se cumple, y la sentencia de retorno jamás es alcanzada
            resultado = metodo(n - 2) + n;
        } else {
            resultado = 0;
        }
        return resultado;
    }
}