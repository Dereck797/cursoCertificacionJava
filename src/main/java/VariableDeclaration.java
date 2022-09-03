public class VariableDeclaration {

    public static int a,d,c = 4;

    public static void main(String[] args) {
        /*Declaración de variables */
        // Se pueden declarar una o multiples variables
        int p = 10;
        System.out.println("Algo");
        System.out.println(p + " " + a + " " + d  + " " + c );
        System.out.println("Algo");

        /*Identificadores*/
        // Se puede utilizar cualquier combinación de letras, números, $ y _
        // No se pueden utilizar palabras reservadas como identificador (incluido goto)
        // No se puede comenzar por carácter numérico
        int _1 = 10; // ok
        /*char break; // error
        int 3jc; // error
        float car.t; // error*/

    }
}
