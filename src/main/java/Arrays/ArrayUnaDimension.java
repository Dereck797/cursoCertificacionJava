package Arrays;

public class ArrayUnaDimension {
  static int [] n;

  public static void main(String[] args) {

    System.out.println(n[0]);
    System.out.println("");
    // ARRAY
    // Es un conjunto de datos de un mismo tipo a los que se accede mediante una única variable
    // Cada dato tiene asocioado un indice dentro del array, empezando por la posición 0
    // Un array es una estructura de datos estática, una ves definido su tamaño no se peude modificar
    // Array de enteros de tamaño 10, apuntado por la variablev:

    // Declaración e instanciación
    // Declaración:

    int [] datos; // Si es variable atributo se inicializa a null, si es local, no se inicializa por defecto.
    int vals[]; // los corchetes se pueden poner depués de la variable.
    // int n[3]; // En la declaración no se puede indicar el tamaño. Esto es error de compilación

    // INSTANCIACIÓN
    // Un array se crea como cualquier objeto a través del operador new, indicando entre los corchetes el tamaño:

    datos = new int[10]; // array de 10 enteros.
    int [] s = new int[20]; // declaración e instanciación

    // Cada posición del array se inicializa con el valor por defecto
    System.out.println(datos[0]); // muestra al valor 0

    // ACCESO A ELEMWENTOS Y CREACIÓN ABREVIADA

    // Acceso a elementos: Se accede con el nombre de la variable y se indica entre corchetes el índice del elemento

    int dato[] = new int[10];
    dato[0] = 15;
    dato[10] = 2; // Si se intenta acceder fuera de los límites del array se produce una ArrayIndexOutOfBoundsException

    // Se puede decalarar, instanciar e inicializaar un array en una misma instrucción:
    int[] valores = new int[]{3,5,20,11};

    // O de forma mas abreviada
    int [] values = {3,4,5,6};

    // Un array es un objeto
    int[] data = new int[5];
    guardar(data);
    System.out.println(data[0]); // muestra 10

    // Un array dispone de la propiedad length que permite conocer en cada momento el tamaño del mismo:
    int[] value = new int[10];
    System.out.println(value.length); // muestra 10. La pisición del último elemento siempre será length-1



    // RECORRIDO DE UN ARRAY
    // Se puede utilizar un bucle for estándar:

    int [] datoss = new int[10];
    // Almacena los 10 primeros números pares
    for (int i = 0; i < datoss.length; i++) {
      datoss[i] = i*2;
    }

    // o un foreach si el acceso es para lectura:
    // Muestra el contenido del array
    for (int n : datoss) {
      System.out.println(n);
    }




  }

  private static void guardar(int data[]) {
    data[0] = 10;
  }
}
