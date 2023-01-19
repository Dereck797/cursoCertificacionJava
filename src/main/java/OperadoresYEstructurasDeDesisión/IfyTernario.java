package OperadoresYEstructurasDeDesisión;

public class IfyTernario {
  public static void main(String[] args) {
    // Instrucción if
    // Compurbea una condición de tipo boolean y ejecuta un bloque de sentencias si se cumple. Opcionalmente, se puede indicar bloque else.
    // Las llaves solo son obligatorias si el bloque contiene más de una instrucción
    // Si la condición no es boolean, se produce un error de compilación
    if(true) {
      System.out.println();
    } else {

    }

    // Operador ternario
    // Es una forma abreviada de la instricción if.    variable = expresion?valor_si:valorno;
    // Evalua una expresión de tipo boolean, si el resultado es verdadero, se devuelve el valor
    // indicado después de la interrogación, si no, devilverá el valor a continuación de los dos puntosd

    int a=3, b=5, c;
    c=(a>b) ? a*a : b--; // c vale 5, pues primero se asigna b a c y luego se decrementa la variable
    System.out.println(c);
  }
}
