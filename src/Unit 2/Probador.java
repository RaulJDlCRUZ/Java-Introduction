class Probador {
    /* 4. Indique cuál es la salida del siguiente programa */
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