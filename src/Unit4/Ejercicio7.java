/*
7. Escriba un método que invierta un vector de enteros. El método debe recibir como argumento el 
vector a invertir y devolver, en otro vector distinto, el vector invertido. Nota: un vector inicial [1, 2, 3, 
4] debería quedar después de la inversión [4, 3 ,2 ,1]. Escriba un programa principal que lea el vector 
de enteros e imprima el vector resultante de la inversión.
*/
package Unit4;

public class Ejercicio7 {
	public static void main(String[] args) {
		int[] vector = { 1, 2, 3, 4 };
		int[] vectorInvertido = inversion(vector);

		for (int i = 0; i < vectorInvertido.length; i++) {
			System.out.print(vectorInvertido[i]);
		}
	}

	private static int[] inversion(int[] vector) {
		int[] vectorInverso = { 0, 0, 0, 0 };
		for (int i = 0; i < vector.length; i++) {
			vectorInverso[i] = vector[vector.length - i - 1];
		}
		return vectorInverso;
	}
}
