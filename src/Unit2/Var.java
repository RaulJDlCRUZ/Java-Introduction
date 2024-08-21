public class Var {
    /* 9. ¿Cuál es el resultado del siguiente programa? */
    public static void main(String[] args) {
        int var = 1;
        boolean r, s, t, v;
        r = (var > 1) && (var++ < 100);
        s = (100 < var) && (150 > var++);
        t = (100 == var) || (200 > var++);
        v = (100 == var) || (200 > var++);
        System.out.println(r + " " + s + " " + t + " " + v);
    } // Fin del main
} // Fin de la clase

// Resultado: false false true true