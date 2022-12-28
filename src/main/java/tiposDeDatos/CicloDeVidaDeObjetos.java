package tiposDeDatos;

public class CicloDeVidaDeObjetos {

  public static void main(String[] args) {
    //metod();
    metodo();
  }

  // Un objeto se crea a partir del operador new, seguido del nombre de la clase.
  // Se devuelve una referencia al objeto que se guarda en una variable de la clase
  public static void metod(){
    Clase1 c = new Clase1();

    System.out.println(c);

    String s = "Hola";

    System.out.println(s);

    Object ob = new Object();

    System.out.println(ob);
  }

  // ----------------------------------------------------------------------------------------------
  // DESTRUCCION DE UN OBJETO

  // Los objetos son eliminados de la moemoria por el Garbage Collector

  // Un objeto es elegido para su recolección cuando no hay referencias al mismo

  // Cuando un objeto es elegido para recolección, la JVM llama al método finalize() del objeto. De cara al exámen,
  // saber que este método puede ser llamado una o ninguna vez durante la vida del objeto. nunca más de una vez.

  // MARCADO DE OBJETOS PARA RECOLECCIÓN. EJEMPLO

  public static void metodo(){
    // Tener claro que ob1 y ob2 no son un objeto sino una variable. El objeto es el que se guarda en la referencia que se asigna a la variable

    Object ob1 = new Object(); // Objeto 1 inicialmente apunta a 1bc6a36e que es la referencia inicial
    System.out.println(ob1);
    Object ob2 = new Object(); // Objeto 2 inicialmente apunta a 1ff8b8f que es la referencia inicial
    System.out.println(ob2);
    ob1 = ob2; // pasa a recolección la referencia a la cual inicialmente estaba apuntando ob1(1bc6a36e) debido a que se le asigna una nueva referencia la cual es la referencia a la que apunta ob2(1ff8b8f)
    System.out.println(ob1);
    System.out.println(ob2);
    ob2 = null;
    System.out.println(ob2);
  } // objeto 2 a recolección

}


// Para poder crear un objeto de una clase se dispone de un elemento que se llama constructor. Este se ejecuta durante la creación de un objeto.
// Cuando se hace un new Clase1() estamos llamando a un constructor.

class Clase1 {

  // Este es el método constructor de la Clase1
  public Clase1(){
    System.out.println("Método constructor");
  }

  // Existe algo llamado sobrecarga que significa crear varios constructores con diferentes firmas del método(a firma se hace referencia con los parametros que recibe el método)

}




