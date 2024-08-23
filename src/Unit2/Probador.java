/* 4. Indique cuál es la salida del siguiente programa */
package Unit2;

class Probador {
    public static void main(String[] args) {
        char probador;
        probador = 'c';
        System.out.println("probador:" + probador);
        ++probador;
        System.out.println("probador:" + probador);
        System.out.println("probador:" + probador++ + probador
                + probador-- + probador);
    } // Fin del main
} // Fin de la clase

/*
Salida:

probador:c
probador:d
probador:deed
*/