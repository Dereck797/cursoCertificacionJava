public class Literals {

    public static void main(String[] args) {

        /*Literales*/
        // Los literales son cualquier valor o representacion que se puede asignar a una variable

        // A continuación tenemos los literales enteros, Se puede utilizar el simbolo _
        // Para separar visualmente los literales. Este caracter solo puede aparecer entre digitos
        // El caracter _ no puede aparecer en los siguientes lugares:

        // Al principio o al final de un número
        // junto a un punto decimal en un número de tipo real
        // Antes  o despues de los sufijos F o L. (Float o Long)
        // Antes o despues de "0X" (hexadecimal) o  "0b" (binario)
        int decimal = +2_8_9; //
        int octal = +0_4_5_3; //
        int hexadecimal = -0xA_F7; // también se puede declarar con la "X" mayuscula
        int binario = 0b100_011; // también se puede declarar con la "B" mayuscula
        long lon = 343453534534l; // al eliminar la l nos arroja error debido a que se debe especificar que es un long
        float flo = 34.33f;

        System.out.println(decimal + " " + octal + " " + hexadecimal + " " + binario + " " + lon + " " + flo);

    }
}
