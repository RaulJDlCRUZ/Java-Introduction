package Session5;

public class Vector06 {
    public static void main(String[] args) {
        int[][] tabla = { { 1 }, { 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.println("Elemento [" + i + "][" + j + "] = " + tabla[i][j]);
            }
            System.out.println();
        }
    }
}