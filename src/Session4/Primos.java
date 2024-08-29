package Session4;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        int num;
        boolean primo = true; // Variable centinela
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime un número: ");
        num = leer.nextInt();
        int i = 2;
        while (i < num / 2 && primo) { // Si el número es primo, no será divisible por ningún número entre 2 y "num/2"
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        if (primo) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }
    }
}
