/*
Construya en Java dos métodos que reciban como único parámetro 
una matriz de enteros.
- El primer método debe devolver la media aritmética de los enteros de la matriz.
- El segundo método debe devolver el valor máximo de la matriz.
Construya un programa principal que lea una matriz de enteros, invoque a ambos métodos e 
imprima los valores devueltos.
*/
package Session7;

public class MediaMaximo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = { 2, 3, 5, 6, 7, 8, 5, 7, 10, 9, 2, 5, 6, 7, 7, 6, 5, 8, 6, 9 };
		int max = MisFunciones.maximo(vector);
		int med = MisFunciones.media(vector);
		int med7 = MisFunciones.media(vector, 7);
		System.out.println("El valor máximo es " + max);
		System.out.println("la media es: " + med);
		System.out.println("la media de los valores mayores de 7 es: " + med7);
	}

}
