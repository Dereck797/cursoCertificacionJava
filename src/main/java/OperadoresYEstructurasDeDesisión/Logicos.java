package OperadoresYEstructurasDeDesisión;

public class Logicos {

  public static void main(String[] args) {
    // Evaluan expresiones de tipo boolean: && || !
    int a =3;
    int c=9;
    int n=0;
    if(a>n && a<c ); // verdadero
    if(!(n==0)); // falso


    // Los operadores && y !! funcionan en modo corto circuito.
    // Esto significa que si el primer operando de la expresión lógica ya determina el resultado fional de la operación, el segundo operado no se evalua

    boolean b = (a<n && a>++c);
    // muestra 9, la segunda condición no llega a evaluarse
    System.out.println(c);
  }
}
