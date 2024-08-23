/*
Codificar un programa que pida al usuario que introduzca a través del teclado su
nombre, apellidos y edad, y posteriormente mostrar los datos
*/
package Session2;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        // Declaración del objeto que nos permite la entrada de datos, en este caso desde teclado (System.in)
        Scanner leer = new Scanner(System.in);

        // Declaración de variables para los datos del usuario
        String nombre = "";
        String apellidos = "";
        int edad = 0;

        // Solicitamos nombre y lo recibimos desde teclado para guardarlo en la variable correspondiente
        System.out.println("Introduzca su nombre:");
        nombre = leer.next();

        // Lo mismo para apellidos
        System.out.println("Introduzca sus apellidos:");
        apellidos = leer.next();

        // Y también para edad, en este caso es un entero, así que usamos nextInt()
        System.out.println("Introduzca su edad:");
        edad = leer.nextInt();

        // Mostramos el valore recogido en las variables
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}
