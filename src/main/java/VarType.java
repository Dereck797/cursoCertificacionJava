public class VarType {
    // Existen dos tipos de variables: Variables objeto y primitivas
    public static void main(String[] args) {

       /*Variables de tipo primitivo */

        // Variable de tipo primitivo. La variable contiene el dato.

        // Estas son los tipos de variables de tipo primitivo que hay
        boolean b = true; // true or false
        byte l = 39; // Entero de 8 bits
        short e = 70; // Entero de 16 bits
        int c = 50000; // Entero de 38 bits
        long f = 200000; // Entero de 64 bits
        float g = 45.6f; // Decimal de 32 bits
        double h = 80.4; // Decimal de 64 bits
        char i = '@'; // codigo unicode de 16 bits

        // En una asignación, cada variable tiene una copia del dato
        int r = 100; // 100
        int a = r;  // 100



        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*Variables de tipo Objeto*/


        // Variable de tipo objeto. La variable contiene una referencia al dato
        Object ob = new Object(); // Lo que tengo en la variable no es el objeto sino su referencia a donde está el objeto en memoria

        // Con variables de tipo objeto, ambas variables apuntan al mismo objeto en memória,
        // eso quiere decir que si el objeto en memoria es modificado, Las variables se verán modificadas debido a la referencia que se hace al objeto.
        Object obm = new Object(); // Referencia al objeto
        Object cb = obm; // Referencia al objeto

        Float q = 4.0f;

    }
}
