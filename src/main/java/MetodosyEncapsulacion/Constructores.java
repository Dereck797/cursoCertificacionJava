package MetodosyEncapsulacion;

public class Constructores {


  public static void main(String[] args) {
    Constructores t1 = new Constructores();
    Constructores t2 = new Constructores();
    // Se imprimirá:
    // bloque
    // constructor
    // bloque
    // constructor
  }

  {
    System.out.println("Bloque");
  }
  // Bloque de código que se ejecuta al crear un objeto de la clase
  // como los métodos pueden recibir parámetros, aunque no tienen tipo de devolución y su nombre es igual al de la clase

  // Si no se define un constructor de forma explicita en una clase, el compilador añade el llamado constructor por defecto, que no tiene parámetros y tampoco ninguna instrucción

  // SOBREWCARGA DE MÉTODOS
  // Se siguen las mismas reglas que con la sobrecarga de métodos


  // LLAMADAS A OTRO CONSTRUCTOR
  // desde un constructor se puede llamar a otro constructor de la misma clase utilizando la expresión this(argumentos)
  // Debe ser la primera instrucción del constructor, no puede ir de últimas porque genera un error de compilación


  public Constructores(){
    this(5);
    System.out.println("Constructor");
  }

  public Constructores(int i){

  }

  // Bloque de inicialización instancia
  // Son bloques de código que se ejecutan cada vez que se crea un objeto de las clases, antes del constructor.
}
