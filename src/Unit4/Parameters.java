package Unit4;

public class Parameters {
    public static void main(String[] args) {
        int num1;
        double num2;
        double[] num3 = new double[1];
        num1 = 1;
        num2 = 4.5;
        num3[0] = 5.1;
        System.out.print("Original values: ");
        System.out.println(num1 + " " + num2 + " " + num3[0]);
        change(num1, num2, num3);
        System.out.print("Values after changes:");
        System.out.println(num1 + " " + num2 + " " + num3[0]);
    } // End main method

    public static void change(int a, double b, double[] c) {
        a = 5;
        b = 7.2;
        c[0] = 9.1;
        System.out.print("Values inside the method: ");
        System.out.println(a + " " + b + " " + c[0]);
    } // End method
}

/*
Original values: 1 4.5 5.1
Values inside the method: 5 7.2 9.1
Values after changes: 1 4.5 9.1
*/