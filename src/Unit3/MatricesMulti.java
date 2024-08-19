class MatricesMulti {
    public static void main(String[] args) {
        int [][] tabla = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        int suma;
        for (int i = 0; i < tabla.length; i++) { // For rows
            for (int j = 0; j < tabla[i].length; j++) { // For columns
                System.out.print (tabla[i][j] + " ") ;
            }
            System.out.println();
        }

        // Adding rows and printing the result
        for (int i = 0; i < tabla.length; i++) {
            suma = 0;
            for (int j = 0; j < tabla[i].length; j++) {
                suma += tabla[i][j];
            }
            System.out.println("Row: " + (i + 1) + "  addition: " + suma);
        }
    } // End method
} // End class