/* 3. ¿Cuál es el resultado del siguiente programa? */
package Unit2;

class Alcance {
	public static void main(String[] args) {
		int i = 3;
		{
			int j = 4; // ESTÁ MAL: NO DEBE IR ENTRE 2 LLAVES (FUERA NO ENCUENTRA LA VARIABLE)
		}
		System.out.println("j: " + j);
		System.out.println("i: " + i);
	}
}