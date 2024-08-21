import java.util.*;
public class Docenas {
    /* 10. Escriba un programa que permita convertir de unidades a docenas.
    - El programa deberá solicitar el número de unidades y deberá calcular e imprimir el número de docenas completas correspondientes, 
        así como el número restante de unidades del total original (no tiene por qué haber siempre un número exacto de docenas.
    - Por ejemplo, 14 unidades son 1 docena más 2 unidades).
    El programa debe realizar la lectura haciendo uso de:
        - la clase Scanner
        - la escritura a través del método printf.
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de unidades: ");
        int unidades = sc.nextInt();
        int docenas = unidades / 12;
        int restantes = unidades % 12;
        if (restantes == 0){
            System.out.printf("%d unidades son %d docenas.\n", unidades, docenas);
        } else {
            System.out.printf("%d unidades son %d docenas más %d unidades.\n", unidades, docenas, restantes);
        }
    }
}
