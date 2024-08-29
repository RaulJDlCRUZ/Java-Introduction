package Session7;

public class MisFunciones {
	public static int maximo(int[] a) {
		int mayor = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > mayor) {
				mayor = a[i];
			}
		}
		return mayor;
	}

	public static int media(int[] matriz) {
		int valor = 0;
		for (int i = 0; i < matriz.length; i++) {
			valor = valor + matriz[i];
		}
		valor = valor / matriz.length;
		return valor;
	}

	// sobrecarga de la función media
	public static int media(int[] matriz, int n) {
		int valor = 0;
		int numeros = 0;
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i] >= n) {
				valor += matriz[i];
				numeros++;
			}
		}
		valor = valor / numeros;
		return valor;
	}

}