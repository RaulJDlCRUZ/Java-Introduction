import java.util.Scanner;
public class GradosConvert
{
    /* 6. Diseñe e implemente un programa que convierta de grados centígrados a Fahrenheit */
    public static void main(String args[]) {
        /* Grados ºC a ºF: GRADOS x 9/5 + 32 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los grados Celsius a convertir: ");
        final float cels = sc.nextFloat();
        double farh = 1.8 * cels + 32;
        System.out.printf("%.2f ºC en Fahrenheit son %.2f ºF", cels, farh);
    }
}