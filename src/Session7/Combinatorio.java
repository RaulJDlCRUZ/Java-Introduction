/*
Escriba un programa calcule las combinaciones de la primitiva, teniendo en cuenta que son 
combinaciones de 49 elementos sin repetición tomados de 6 en 6. Es decir sería el número
combinatorio: C(49,6)

Deberemos crear la función factorial, teniendo en cuenta que el factorial de un número es 
ese número multiplicado por todos los menores que él, y que el factorial de = es 1. el 
factorial de n se representa como n!

La fórmula que me calcula el número combinatorio c(n,k) es la siguiente:

		c(n,k)=n!/(k! * (n-k)!)

Debemos diseñar una función que calcule el valor de un número combinatorio. Y usar esa 
función para resolver el problema del número de combinaciones de lotería primitiva 
posibles.
*/
package Session7;

public class Combinatorio {
	public static void main(String[] args) {
		final int combinaciones = 49;
		final int grupos = 6;
		double resultado = combinatorio(combinaciones, grupos);
		System.out.println("El num total de combinaciones es: " + (long) resultado);
	}

	public static double factorial(int n) {
		double f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		return f;
	}

	public static double combinatorio(int n, int k) {
		double factN, factK, factNK, comb;
		factN = factorial(n);
		factK = factorial(k);
		factNK = factorial(n - k);
		comb = factN / (factK * factNK);
		return comb;
	}

}