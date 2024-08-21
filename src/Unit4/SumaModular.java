package Unit4;
import java.util.Scanner;

/*
Programa modular para calcular la suma de dos números enteros
*/
public class SumaModular {
    /**
     * Método main
     * 
     * @param args La lista de parámetros no se usa
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        // Leyendo el valor
        System.out.println("Programa para calcular la suma de dos números");
        System.out.println("Introduce el primer número");
        num1 = leer.nextInt();
        System.out.println("Introduce el segundo número");
        num2 = leer.nextInt();
        // Escribiendo la raíz cuadrada de x
        System.out.println("La suma es: " + suma(num1, num2));
    }

    /**
     * Método suma. Calcula la suma de dos números enteros
     * 
     * @param num1 Primer número a sumar
     * @param num2 Segundo número a sumar
     * @return Devuelve la suma de los valores pasados por parámetros
     */
    
    public static int suma(int num1, int num2) {
        int suma = num1 + num2; // Resulado
        return suma;
    }
}