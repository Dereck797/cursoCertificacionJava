package TiposDeDatos;

public class ClasesDeEnvoltorio {

  public void metodo(){
    // Las clases de envolotorio son clases que encapusulan a tipos primitivos de datos
    // Son un juego de clases que se encuentran en JavaLang y sirven para representar en forma de objetos a los distintos tipos primitivos de Java
    // Encapsulan tipos primitivos como objetos

    Integer integ = 200;
    Double db =30.4;

    int k = integ.intValue();
    double d= db.doubleValue();

    // Estas clases de envoltorio dispónen de unos métodos estáticos para convertir cadenas de caracteres en tipos primitivos
    int p = Integer.parseInt("300");
    int n = Integer.parseInt("100011",2); //35
    Integer num = Integer.valueOf("100011",2); //35


    // ----------------------------------------------------------------------------------------------------------------------------------------------------------------

    // AUTOBOXING / UNBOXING
    // Se puede asignar directamente el tipo primitivo a la variable objeto (autoboxing), Evita tener que crear los objetos con un new Integer();
    Integer ent = 200; // Autoboxing
    Double dbl = 47.7; // Autoboxing

    // Se puede recuperar el tipo primitivo asignando directamente la variable objeto a la variable primitiva (unboxing):
    // en este caso no es necesario aplicar el método .intValue para el caso de Integer o doubleValue para el caso de Double para asignar el valor a un tipo primitivo
    int a = ent; // unboxing
    Integer h = 30; // autoboxing
    h++; // unboxing mas autoboxing

    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------

    // INMUTABILIDAD DE OBJETOS
    // Los objetos de las clases envoltorio son inmutables, no se pueden modificar:

    Integer we = 200; // Autoboxing
    ent= ent + 100; // genera un nuevo Objeto, unboxing + autoboxing.
  }
}
