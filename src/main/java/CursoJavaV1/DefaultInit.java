package CursoJavaV1;

public class DefaultInit {

    /* Inicialización por defecto  */

    // Las variables o atributos se inicializan por defecto.

    // De tipo Decimal Se inicializa con 0.0 por defecto
    static int c;

    // De tipo entero Se inicializa con 0 por defecto
    static float d;

    // De tipo boolean Se inicializa con false por defecto
    static boolean b;

    // De tipo char Se inicializa con "\u0000"(Esto representa un caracter nulo) por defecto
    static char a;

    // De tipo objeto se inicializa con null

    public static void main(String[] args) {

        // Las variables locales NO se inicializan por defecto. Es necesario asignarles un valor antes de utilizarlas.
        /*int c;
        c = c + 3;*/

        System.out.println(c);
        System.out.println(d);
        System.out.println(b);
        System.out.println(a);

    }
}
