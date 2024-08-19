public class Desbordamiento {
    /* 5. Proponga un programa que muestre un overflow con enteros */
    public static void main(String args[]) {
        int gran_numero = 2147483647; // Equivale a Integer.MAX_VALUE
        System.out.printf("Número más grande teóricamente: %d\n", gran_numero);
        int giga_numero = gran_numero + 1000;
        System.out.printf("Más grande aún: %d\n", giga_numero);
        if (giga_numero < gran_numero) {
            // Si entra aquí, el registro ha dado la vuelta y sigue por el valor mínimo
            // ESTO PRUEBA UN DESBORDAMIENTO
            System.out.println("¡Desbordamiento de entero!");
        }
    }
}
