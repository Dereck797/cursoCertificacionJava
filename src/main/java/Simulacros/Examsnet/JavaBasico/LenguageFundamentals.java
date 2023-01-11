package Simulacros.Examsnet.JavaBasico;


public class LenguageFundamentals {

  public static void main(String[] args) {

    Foo.alpha();


    // Como b está definida como una variable estática, su valor se va acumulando en el método constructor cada vez que se realiza una instancia.

    Estudiantes e1 = new Estudiantes();
    e1.mostrarInfo();
    Estudiantes e2 = new Estudiantes();
    e2.mostrarInfo();

    // Otra caracteristica es que si b está definido como estático se llama directamente de la clase.
    Estudiantes.b++;
    // No se puede llamar un método o variable estatica desde una instancia de la clase, lo siguiente es un error de compilación
    // e1.b;

  }
}

class Foo {
  static void alpha(){
    // Esta es la única manera en la que puedo llamar un método no estático dentro de uno estático y es creando un objeto.
    Foo foo = new Foo();
    foo.beta();
  }
  // Para los métodos no estaticos es permitido llamar métodos estaticos, pero no se puede llamar un método no estático en uno estático a no sewr que se cree un objeto.
  void beta(){
    alpha();
  }
}

class Estudiantes {
  int a;

  // Las variables estaticas nos permiten compartir el valor de la variable sin importar las instancias realizadas al objeto.
  static int b;

  Estudiantes() {
    b++;
  }

  public void mostrarInfo() {
    System.out.println("Valor de a = " + a);
    System.out.println("Valor de b = " + b);
  }
}
