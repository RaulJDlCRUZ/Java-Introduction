/* 1. ¿Qué imprime el siguiente programa?
    a) 96
    b) 90 91 92 93
    c) 96 90 92 92
    d) 96 92 92 90
*/
package Unit4;

public class EjercicioUno {
    public static void main(String[] args) {
        int[] m1 = { 100, 101, 102, 103, 104, 105, 106, 107, 108, 109 };
        int[] m2 = { 90, 91, 92, 93 };
        metodo1(m1[7]);
        metodo1(m2[3]);
        metodo2(m2);
        m1 = metodo3(m2);
        System.out.print(m1[3]);
        for (int i = m2.length - 2; i >= 0; i--)
            System.out.print(" " + m1[i]);
    }

    public static void metodo1(int n) {
        n = 0;
        n = n + 10;
    }

    public static void metodo2(int[] matriz1) {
        matriz1[2] = matriz1[0];
    }

    public static int[] metodo3(int[] matriz2) {
        int[] matriz3 = new int[matriz2.length];
        for (int i = 0; i < matriz3.length; i++)
            matriz3[i] = matriz2[i] + i;
        return matriz3;
    }
}

// El resultado es 96 92 92 90

/* Pasamos a metodo1 107, se reemplaza por 0, se suma 10, queda 10. Luego 93, queda igual
    [!] ESTAMOS PASANDO ENTEROS, SE PASA UNA COPIA DEL VALOR
Con metodo2, m2 pasa a ser {90, 91, 90, 93}
La matriz m1 es reemplazada por el resultado de metodo3 sobre m2:
    {90+0, 91+1, 90+2, 93+3}
    Devuelve {90, 92, 92, 96}
Al final, imprimo 96 y luego el array m2 en orden inverso desde el tercer elemento:
    92, 92 y 90
*/