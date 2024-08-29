/* SERIE CRECIENTE.
Debemos hacer un algoritmo que rellene un vector de 30 número al azar entre 1 y 100, y 
además nos mostrará la serie creciente de mayor tamaño que contiene el vector. 
Por ejemplo si el vector generado es:
	2 3 4 2 4 8 9 1 1 8 2 9 2 0 88 2 81 22 12 22 8 9 10 23 38 49 22 33 1 98
Debe imprimir:  
	Vector: 2 3 4 2 4 8 9 1 1 8 2 9 2 0 88 2 81 22 12 22 8 9 10 23 38 49 22 33 1 98 
	Mayor subserie creciente: 8 9 10 23 38 49
*/
package Session6;

public class SerieCreciente {

	public static void main(String[] args) {
		int[] serie = new int[30]; // Serie de 30 numeros, array de 1 dimension
		int longitud = 1;
		int longitudMaxima = 1;
		int inicioSerie = 0;
		int inicioSerieMaxima = 0;

		for (int i = 0; i < 30; i++) {
			serie[i] = (int) (Math.random() * 100) + 1;
			System.out.print(serie[i] + " ");
		}
		int anterior = serie[0];
		for (int i = 1; i < 30; i++) {
			if (serie[i] > anterior) {
				longitud++;
			} else {
				if (longitud > longitudMaxima) {
					longitudMaxima = longitud;
					inicioSerieMaxima = inicioSerie;
				}
				longitud = 1;
				inicioSerie = i;
			}
			anterior = serie[i];
		}
		// Es necesario comparar si la ultima serie fuera la mayor
		if (longitud > longitudMaxima) {
			longitudMaxima = longitud;
			inicioSerieMaxima = inicioSerie;
		}
		System.out.println();

		for (int i = inicioSerieMaxima; i < inicioSerieMaxima + longitudMaxima; i++) {
			System.out.print(serie[i] + " ");
		}

	}

}
