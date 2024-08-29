/*
- Tomar varios valores enteros desde los parámetros del programa
- Considerar varios valores separados por espacios, y un separador 
  especiales con el carácter #.
- Sumar todos los números enteros entre cada símbolo especial, y 
  poner el resultado en un vector de resultado.
- En cada ejecución se puede meter un número variable de valores
- Como parámetro se puede acabar en un número o símbolo especial
*/
package Session5;

public class Vector05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vectorSumas = new int[args.length / 2 + 1];
		int suma = 0;
		int nSumas = 0;
		for (int i = 0; i < args.length; i++) {
			String valor = args[i];
			if (!valor.equals("#")) {
				suma += Integer.parseInt(valor);
			} else {
				vectorSumas[nSumas] = suma;
				nSumas++;
				suma = 0;
			}
		}
		vectorSumas[nSumas] = suma;
		System.out.print("Resultado: | ");
		for (int i = 0; i <= nSumas; i++) {
			System.out.print(vectorSumas[i] + " | ");
		}
	}
}