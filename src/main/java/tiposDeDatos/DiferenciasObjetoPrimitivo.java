package tiposDeDatos;

public class DiferenciasObjetoPrimitivo {

    public void metod(){

        //PRIMITIVOS
        boolean bol = true; // true or false
        byte byt = 99; // Entero de 8 bits
        short sho = 9999; // Entero de 16 bits
        int in = 999999999; // Entero de 32 bits
        long lo = 999999999; // Entero de 64 bits
        float flo = 45.6f; // Decimal de 32 bits
        double dou = 80.4; // Decimal de 64 bits
        char ch = '@'; // código unicode de 16 bits


        int n = 200; // La variable contiene al dato.

        // En una asignación cada variable tiene una copa del dato
        int r = 100; // r=100
        int a = r;  // a=100


        //OBJETO

        // Son todos los objetos de cualquier clase Java.
        // Se manejan a través de variables de su tipo (clase).
        // La variable contiene una referencia al objeto.
        // Mediante la variable se accede a los métodos del objeto.
        String s = new String("Hola");
        s.length();
        // NO se puede hacer conversiones ni implicitas ni explicitas entre tipos de datos primitivos y de objeto.

        // Los tipos objeto. La variable contiene una referencia al dato.
        Object ob = new Object();
        Object cp = ob; // Con variables objeto  ambas variables apuntan al mismo objeto

        // ob=382j2f (382j2f este es un código ficticio que representa la dirección en donde está la referencia del objeto)
        // cp=382j2f ambas variables tipo objeto apuntan a la misma referencia

    }
}
