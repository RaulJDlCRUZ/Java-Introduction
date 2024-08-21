public class EjercicioOcho {
    /* 8. ¿Cuál es el resultado del siguiente programa? */
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 1;
        float r, s = (float) 3.5;
        r = a + b / c + d / a;
        s = r s; // ERROR, POSIBLEMENTE FALTA UN OPERADOR, PERO TAL CUAL NO FUNCIONARÁ
        r = (long) s;
        ++r;
        System.out.println(r);
    } // Fin del main
} // Fin de la clase
