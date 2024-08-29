package Session5;

public class Vector04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v1 = { 3, 6, 3, 6, 3, 8, 9, 2, 3, 1, 7, 0, 4 };
		int[] v2 = { 4, 6, 6, 9, 0, 5, 5, 7, 3, 0, 4, 5, 9 };
		// Resultado = {4,6,6,9,3,8,9,7,3,1,7,5,9};
		int[] v3 = new int[v1.length];
		for (int i = 0; i < v1.length; i++) {
			/*
			 * Equivalente a:
			 * if( v1[i] > v2[i] ) {
			 *     v3[i] = v1[i];
			 * } else {
			 *     v3[i] = v2[i];
			 * }
			 */
			v3[i] = Math.max(v1[i], v2[i]);
		}
		for (int i = 0; i < v3.length; i++) {
			System.out.print(" " + v3[i]);
		}
	}
}