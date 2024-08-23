package Unit3;

import java.util.*;

class Condition {
    // Example of conditional instruction if-else
    public static void main(String[] args) {
        int x;
        Scanner leer = new Scanner(System.in);

        // Reading data
        System.out.println("Insert an integer");
        x = leer.nextInt();
        System.out.println("Integer written" + x);
        // Using the condition
        if (x < 0) {
            System.out.println("The number is negative");
        } // End of "true" (if) branch
        else {
            System.out.println("The number is positive");
        } // End of else
        System.out.println("End of program");
    } // End of main method
} // End of class Condition