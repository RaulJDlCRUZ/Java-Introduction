/* 7. Indique cuál es la salida del siguiente programa */
package Unit2;

public class Suma {
    public static void main(String[] args) {
        int suma = 30;
        System.out.println(suma++ + "  " + ++suma +
                "   " + suma + "   " + suma--);
        System.out.println(suma);
    } // Fin del main
} // Fin de la clase

/*
Salida:

30  32   32   32
31
*/