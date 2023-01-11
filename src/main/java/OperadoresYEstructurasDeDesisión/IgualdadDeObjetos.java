package OperadoresYEstructurasDeDesisión;

public class IgualdadDeObjetos {

  public static void main(String[] args) {
    // El operador == se utiliza para comprobar la igualdad con tipos primitivos

    // En variables de tipo objeto compara referencias, no los objetos:

    String n1 = new String("cadena");
    String n2 = new String("cadena");

    if(n1==n2){ // El resultado es falso debido a que al apuntar a objetos diferentes, las referencias son diferentes.
      System.out.println("");
    }

    if(n1.equals(n2)){ // el resultado es verdaderp
      System.out.println("");
    }

    // -----------------------------------------------------------------------------------------------------------------------------------------

    // Igualdad de cadenas
    // Para comparar dos cadenas de caracteres utilizamos el método equals():

    String b1 = "cadena";
    String b2 = "cadena";

    if(b1.equals(b2)){ // el resultado es verdadero
      System.out.println("");
    }

    // Pool de cadenas
    // Java utiliza un pool de literales de cadenas de caracteres para optimizar memoria:
    // Al asignar in literal de cadena, no se crea un nuevo objeto, se comprueba si eciste en el pool y
    // si es así devuelve una referenca al objeto existente. Si no existe, se crea y se graba en el pool.

    if(b1 == b2){ // el resultado es verdadero
      System.out.println("");
    }

    // El método equals distingue mayusculas y minusculas, para ignorar la diferencia, utilizamos equalsIgnoreCase();
  }
}
