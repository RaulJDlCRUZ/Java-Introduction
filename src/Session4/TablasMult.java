/* Imprimir por pantalla las 10 tablas de multiplicar */
package Session4;

public class TablasMult {
    public static void main(String[] args) {
        int producto;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                producto = i * j;
                System.out.println(i + " x " + j + " = " + producto);
            }
            System.out.println();
        }
    }
}
