package tiposDeDatos;

public class PrimitivosConversionesDeTipo {


    //Todos los tipos primitivos son convertibles en otros , salvo boolean
    //Conversiones implicitas
    int x = 45;
    double n = x;

    //Reglas:
    //El tipo de destino tiene que ser  de igual o mayor tamaño que el de origen.
    //La regla anterior tiene las siguientes excepciones que no permiten conversiones implicitas:


    // Falla si el tipo de origen es numerico (cualquier tipo) y el destino es char:
    /*byte b=5;
    char n=b; // error*/

    // Falla si el tipo de origen es decimal y el tipo de destino es entero:
    /*float r = 34.5f;
    long l = r;*/

    //Conversiones explicitas
    double r = 45.3f;
    int g = (int)r; // Casting


    // Cuando no es posible una conversipon implicita, siempre será posible una conversión explicita.

    byte b = 5;
    char w = (char)b;

    float k = 3.4f;
    long l = (long)k;


}
