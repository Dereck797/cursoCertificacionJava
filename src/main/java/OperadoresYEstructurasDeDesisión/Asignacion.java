package OperadoresYEstructurasDeDesisión;

public class Asignacion {

  public static void main(String[] args) {
    // El operador = Asigna el resultado de una expresión a una variable.

    // Los operadores +=, -=, *=, %=, realizan la operación entre un dato y la variable y asignan el resultado a la variable.

    int o = 3;
    o+=10;// equivale a:    a=a+10;
    byte p=10;
    p+=5; // ojo, equivale a b=(bute)(b+5)
    // p=p+5; // esto provoca error de compilación, pues una operación con int(los literales enteros son int) siempre da como resultado int.
    System.out.println(p);
  }
}
