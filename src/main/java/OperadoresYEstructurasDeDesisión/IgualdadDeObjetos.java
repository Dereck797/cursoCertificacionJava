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

    if(n1.equals(n2)){ // el resultado es verdadero
      System.out.println("");
    }

    // -----------------------------------------------------------------------------------------------------------------------------------------

    // IGUALDAD DE CADENAS

    // Para comparar dos cadenas de caracteres utilizamos el método equals():

    String b1 = "cadena";
    String b2 = "cadena";

    if(b1.equals(b2)){ // el resultado es verdadero
      System.out.println("");
    }
    // POOL DE CADENAS

    // Java utiliza un pool de literales de cadenas de caracteres para optimizar memoria:
    // Al asignar un literal de cadena, no se crea un nuevo objeto, se comprueba si eciste en el pool y
    // si es así devuelve una referenca al objeto existente. Si no existe, se crea y se graba en el pool.

    if(b1 == b2){ // el resultado es verdadero
      System.out.println("");
    }

    // El método equals distingue mayusculas y minusculas, para ignorar la diferencia, utilizamos equalsIgnoreCase();


    // ---------------------------------------------------------------------------------------------------------------------------------------
    // IGUALDAD DE OBJETOS DE ENVOLTORIO
    // Se aplica lo mismo que para cadenas


    // Diferentes objetos apuntan a referencias diferentes
    Integer int1 = new Integer(20);
    Integer int2 = new Integer(20);

    // Mismo objeto - apuntan a la misma referencia
    Integer int_1 = 20;
    Integer int_2 = 20;


    // Se puede utilizar el método equals para comparar los valorers envueltos por el objeto eso quiere decir, cuando se crea con "new Integer();"

    // ---------------------------------------------------------------------------------------------------------------------------------------
    // IGUALDAD DE STRINGBUILDER
    // Representa cadenas mutables (modificables)
    // No sobreescribe equals(), por lo que en este caso "==" y "equals()" producen el mismo efecto. Solo verdadero cuando apuntan al mismo objeto.
    // Un stringbuilder no se puede concatenar

    StringBuilder u1 = new StringBuilder("cadena");
    StringBuilder u2 = new StringBuilder("cadena");
    StringBuilder u3 = u2;
    if(u1==u2){ // El resultado es falso
      System.out.println("");
    }
    if(u1.equals(u2)){ // el resultado es igualmente falso. Tener cuidado porque con stringbuilder no funciona el equals
      System.out.println("");
    }
    if(u2==u3){ // el resultado es verdadero. Es unicamente verdadero cuando apuntan a la misma referencia del objeto
      System.out.println("");
    }


    // ---------------------------------------------------------------------------------------------------------------------------------------
    // Inmutabilidad de los objetos String
    // Un objeto String representa una cadena de caracteres inmutable, es decir, no se puede modificar.
    // En la concatenacion, no se modifica ningún objeto existente, se crea uno nuevo.

    String f1 = "cadena";
    String f2 = "completa";
    f1 = f1+f2;

    System.out.println(f1);


    // Adicionales

    System.out.println("6+3="+2+7); // En este caso se imprime "6+3=27" debido a que primero se operan las concatenaciones
    System.out.println("6+3="+(2+7)); // En este caso se imprime "6+3=9" debido a que al encerrar la suma entre parentesis, va a realizar primero la suma y lueog la concatenación

  }
}
