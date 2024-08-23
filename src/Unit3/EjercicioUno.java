/* 1. ¿Cuál es resultado del siguiente programa?
  a) Daría error porque falta la sentencia break dentro de case 0 y case 1 
  b) 0 
  c) -4 
  d) Daría error porque en la parte default divide por 0
*/
package Unit3;

class EjercicioUno {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                case 2:
                    j = j + i;
                    break;
                case 1:
                    j = j * i;
                case 3:
                    j = j - i;
                    break;
                default:
                    j = i / j;
            }
        }
        System.out.println(j);
        // El resultado es -4
    }
}