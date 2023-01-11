package OperadoresYEstructurasDeDesisión;

public class Aritmeticos {

  // Los operadores aritmeticos se emplean con tipos numericos primitivos para realizar operaciones aritméticas en un programa: + - * / % ++ --

  public static void main(String[] args) {
    int a =3;
    a++; // equivale. a = (int)(a+1);
    int x = 6, y=10, z;
    z=y/x; // el resultado es 1, la división entre enteros es un entero.

    // Los operadores ++ y -- se aplican con tipos numericos y pueden ir delante o detras de la variable:
    int q=3 , b;
    b =++a; // b toma el valor de 4

    int f=3, h;
    h=a++; // b toma el valor de 3. Primero asigna y luego incrementa.

  }
}
