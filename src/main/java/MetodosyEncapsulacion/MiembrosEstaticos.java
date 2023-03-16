package MetodosyEncapsulacion;

public class MiembrosEstaticos {
  // Los métodos estáticos son métodos que no están asociados a ningún objeto particular de la clase.
  // Se declaran con la palabra static
  // No es necesario crear un objeto para llamar a estos métodos,se utiliza el nombre de la clase:
  public static int cuadrado(int a){
    return a*a;
  }

  public static void main(String[] args) {
    Test t1 = new Test();
    Test t2 = new Test();
    t1.inc();
    t2.inc();
    System.out.println(t1.getN()); // En este caso imprime 2. Al igual, si se llamara desde t2


    // BLOQUE ESTATICOS

    Test1 t11 = new Test1();
    Test1 t12 = new Test1();
    System.out.println(t11.getN()); // en este y el siguiente caso siempre se va a imprimir 1 debido a que el bloque estatico se ejecutó la primera vez que se creó una instancia a la case
    System.out.println(t12.getN()); //
  }
}

// Concideraciones de los métodos estáticos
// Solo pueden llamar a otros miembros de su misma clase que también sean static
class OtraClase {
  // Aunque es la forma habitual de usuarlos, también se les puede llamar con cualquier instancia de la clase
  int r = MiembrosEstaticos.cuadrado(4);
}

class Test{
  int a=2;

  // Los atributos estaticos son compartidos por todos los objetos o instancias de la clase.
  static int n = 0;

  public void inc(){
    n++;
  }

  public int getN(){return n;}
  static int b =5;

  // No se puede usar en su interior ni this ni super
  public static void metodo(){
    // int c = a*3; error de compilacion debido a que debe utilizar variables del mismo tipo static
    int n = b+1;
    imprime(n);

  }
  static void imprime(int s){}
}

// BLOQUES ESTATICOS
class Test1{
  static int n=0;
  // Los bloques estaticos se ejecutan una vez durante la vida de una clase.
  // Solo pueden acceder otros miembros que sean estaticos
  static {
    n++;
  }

  public static int getN() {
    return n;
  }
}
