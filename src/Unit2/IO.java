package Unit2;
import java.util.*;

class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Insert a string: ");
        String cad1 = sc.nextLine();

        System.out.print("Insert a string without backspaces: ");
        String cad2 = sc.next();

        System.out.print("Insert a double: ");
        double d = sc.nextDouble();

        System.out.print("Insert an integer: ");
        int i = sc.nextInt();
        System.out.printf(Locale.US,
                "\nThe inserted data String type are:" +
                        "\ncad1: %s" +
                        "\ncad1: %20s" +
                        "\ncad2: %s" +
                        "\ncad2: %10.5s\n",
                cad1, cad1, cad2, cad2);

        System.out.printf(Locale.US,
                "\nThe inserted doubles are:" +
                        "\ndouble: %7.4f" +
                        "\ndouble: %7.3f" +
                        "\ndouble: %7.2f\n",
                d, d, d);

        System.out.printf(Locale.US,
                "\nThe inserted integers are:" +
                        "\ninteger: %d" +
                        "\ninteger: %5d",
                i, i);

    } // End of main method
} // End of Class IO