package CursoJavaV2;

public class Tipos_primitivos_objeto_03 {

    // Tipos de datos de Java

    // Tipos primitivos
    boolean valor= true;
    byte valorB = 39;
    short valorB1 = 780;
    int valorB2 = 59400;
    long valorB3 = 200000l;
    float valorB4 = 45.66666f;
    double valorB5 = 80.4;
    char valorB6 = 'a';

    // Todos los tipos de datos primitivos son convertibles en otros, salvo boolean.
    // Las conversioens pueden ser:

    //Implicitas -
    int x=45;
    double n=x;

    //Explicitas
    double r = 4.5f;
    int q = (int)r;


    // Tipos Objetos




    public static void main(String[] args) {

    }

    /*Literales*/
    // Los literales son cualquier valor o representacion que se puede asignar a una variable

    // A continuación tenemos los literales numéricos


    // Se puede utilizar el simbolo _
    // Para separar visualmente los literales. Este caracter solo puede aparecer entre digitos
    // El caracter _ no puede aparecer en los siguientes lugares:

    // Al principio o al final de un número
    // junto a un punto decimal en un número de tipo real
    // Antes  o despues de los sufijos F o L. (Float o Long)
    // Antes o despues de "0X" (hexadecimal) o  "0b" (binario)

    int decimal = +2_8_9; //
    int octal = +0_4_5_3; // tódo numero que inicie con 0 sinifica que es un octal
    int hexadecimal = -0xA_F7; // también se puede declarar con la "X" mayuscula
    int binario = 0b100_011; // también se puede declarar con la "B" mayuscula
    long lon = 343453534534l; // al eliminar la l nos arroja error debido a que se debe especificar que es un long
    float flo = 34.33f;



}
