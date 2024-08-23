/* 5. Suponga que r1 y r2 son dos números reales.
Escriba el código necesario para determinar si son iguales,
suponiendo que la precisión de la representación numérica es p.
*/
package Unit3;

public class IgualesR1R2 {

    public static void main(String[] args) {
        double r1 = 0.1;
        double r2 = 0.1;
        double p = 0.0001;
        if (Math.abs(r1 - r2) < p) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

}
