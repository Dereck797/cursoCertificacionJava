package OperadoresYEstructurasDeDesisión;

public class Switch {

  public static void main(String[] args) {

    // INSTRUCCIÖN SWITCH
    // Evalua una expresión cuyo resultado debe ser entero(int) o string. Se ejecutarán diferentes bloques de sentencias en función de los posibles resultados
    // Si el resultado de la expresión coincide con uno de los valores indicados en los case, ejcutará el bloque correspondiente
    // sino, entrará en el bloque default (opcional);

    // La instrucción break al final de cada bloque case es opcional. Si no se indica, el programa entrará en el siguiente bloque:
    int a=10;

    switch (a) {
      case 10:
        System.out.println("Es 10");
      default: // El bloque default es opcional y no tiene que aparecer necesariamente al final:
        System.out.println("Sin valor");
    }
    // El programa muestra: Es 10 Sin valor


    // VALORES DE LOS CASE

    // Los valores de los case deben ser literales o constantes enteras int, o convertibles implicitamente en int:
    int p=5;
    final int k = 30;
    int n=3;

    switch (p){
      case 10: // ok es un literal int
      case k: // ok, es una constante
      // case p: // error de compilación, no es una constante
      case '@': // ok, char convertible implicitamente a int
    }



  }
}
