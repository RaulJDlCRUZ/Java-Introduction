/* 11. ¿Qué imprime el siguiente programa si se le introduce por teclado el nombre de un fichero? */
package Unit4;

import java.io.*;
import java.util.*;

public class Ficheros {
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        PrintWriter out1;
        Scanner in1;
        String cad1;
        int sol;

        System.out.println("Introduzca el nombre del fichero");
        cad1 = leer.next();
        out1 = new PrintWriter(new FileWriter(cad1));

        for (int aa = 0; aa < 100; aa = aa + 20) {
            // en un fichero escribe: 0 20 40 60 80
            out1.printf("%d ", aa);
        }
        out1.close();
        in1 = new Scanner(new FileReader(cad1));

        for (int bb = 0; bb < 100; bb = bb + 30) {
            sol = in1.nextInt();
            // Por consola saca 4 números (0,30,60,90): 0 20 40 60
            System.out.printf("%d ", sol);
        }
        in1.close();
    } // fin main
} // fin clase