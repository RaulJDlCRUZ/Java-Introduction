package Session5;

public class Vector03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int [][] matriz = new int[4][5];
		int[][] matriz = { { 1, 2, 3, 3, 4 }, { 1, 1, 5, 6, 4 }, { 6, 3, 3 }, { 1, 1, 1, 4, 7 } };
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println();
		}

	}

}
