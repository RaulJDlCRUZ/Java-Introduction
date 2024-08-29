package Session9;

class Recursion {
    public static void main(String[] args) {
        System.out.println(metodo(8));
    }

    public static int metodo(int n) {
        int resultado = 2;
        if (n != 4) {
            resultado = metodo(n - 2) + n;
        } else {
            resultado = 0;
        }
        return resultado;
    } // Fin del método
} // Fin de la clase Recursion

// Resultado: 14