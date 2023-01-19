package TiposDeDatos;

public class Literales {

    // Los literales enteros se pueden representar en

    // Decimal: 289
    // Octal: 0453
    // Hexadecimal: 0xAF7
    // Binario: 0b100011

    // Se puede utilizar el simbolo _ para representar un literal numerico
    int n = 2_345;
    double d = 45.34_2;


    // No se puede utilizar el simbolo _ al principio, al final o junto al punto deicmal. Los siguientes son errores de compilación
    /*int q = _345;
    double a = 45._3;
    long ln = 234_;*/

    // para que un literal int sea long, agregaamos una l o en mayuscula o en minuscula al final del nuero
    int g = 233423;
    long f = 233423l;
    long f2 = 233423L;

    // para que un literal double sea float, agregamos una f o en mayuscula o en minuscula al final
    double i = 34534.23;
    float h = 34534.23f;
    float h2 = 34534.23F;



}
