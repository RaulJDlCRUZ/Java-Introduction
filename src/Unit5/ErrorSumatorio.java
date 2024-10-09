/* 7. ¿Cuál es el error del siguiente método que pretende evaluar un sumatorio? ¿Cómo corregiría el error? */
package Unit5;

public class ErrorSumatorio {
    public static int suma(int numero) {
        if (numero == 0)
            return 0;
        else
            // numero + suma(numero-1); INCORRECTO: FALTA LA OPERACIÓN DE RETORNO
            return numero + suma(numero - 1);
    }// Fin del método suma
}