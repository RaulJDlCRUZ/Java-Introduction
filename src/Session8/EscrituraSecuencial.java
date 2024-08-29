/*
Construya en Java un programa que lee por teclado alias de
jugadores y los escribe en un fichero de forma secuencial,
con un alias por línea
*/
package Session8;

import java.io.*;
import java.util.Scanner;

public class EscrituraSecuencial {
    public static void main(String[] args) throws IOException {
        Scanner lectura_teclado;
        Scanner lectura_fichero;
        File fichero;
        PrintWriter salida;
        String nombrefich;
        lectura_teclado = new Scanner(System.in);
        System.out.println("Introduzca el nombre del fichero");
        nombrefich = lectura_teclado.next();
        /* ESCRITURA */
        fichero = new File(nombrefich);
        salida = new PrintWriter(new FileWriter(fichero));
        boolean masAlias = false;
        do {
            System.out.print("\nIntroduzca un alias de jugador: ");
            String alias = lectura_teclado.next();
            salida.println(alias);
            System.out.print("Introducir más alias? (s/n) ");
            masAlias = lectura_teclado.next().equals("s");
        } while (masAlias);
        salida.close();
    }
}