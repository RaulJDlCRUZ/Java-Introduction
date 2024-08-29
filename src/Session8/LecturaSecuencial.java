/*
Construya en Java un programa que lee de un fichero alias de 
jugadores y los muestra por pantalla.
*/
package Session8;

import java.io.*;
import java.util.Scanner;

public class LecturaSecuencial {

    public static void main(String[] args) throws IOException {
        Scanner lectura_teclado;
        Scanner lectura_fichero;
        File fichero;
        String nombrefich;
        lectura_teclado = new Scanner(System.in);
        System.out.println("Introduzca el nombre del fichero");
        nombrefich = lectura_teclado.next();
        fichero = new File(nombrefich);
        lectura_fichero = new Scanner(fichero);
        System.out.println("\nLeyendo de fichero " + nombrefich + " e imprimiendo en pantalla");
        /* LECTURA */
        while (lectura_fichero.hasNext()) {
            String alias = lectura_fichero.next();
            System.out.println(alias);
        } // fin while
        lectura_fichero.close();
    } // Fin método main
}