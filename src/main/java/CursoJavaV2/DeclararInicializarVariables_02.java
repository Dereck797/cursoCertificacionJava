package CursoJavaV2;

// Declaración e inicialización de variables y su ámbito

public class DeclararInicializarVariables_02 {

    public static void main(String[] args) {
        //Declaración
        int mivar;

        //Declaración e inicialización
        int p=10;

        // Declaración múltiple. Alguna de las variables puede tener un valor inicial
        int q, s, a=5;


        // Identificadores

        // Se puede utilizar cualquier combinación de letras, números, $ y _ sin embargo existen las siguientes restricciones:
        // -No se pueden utilizar palabras reservadas como identificador (incluido goto)
        // -No se puede iniciar con caracteres numéricos

        int _1 = 10; // ok
        // char break; // error
        // int 3jc; // error
        // float car.t; // error

    }

    // mbito de variables

    // Las variables pueden declararse a nivel de clase compartidas por todos los métodos. Se les conoce como atributos o campos.
    int n;

    // También se pueden declarar en el interior de un método. Se les conoce como locales. Solo son visibles dentro de ese método.
    public void variable(){
        int c; // Variable local
        int n; // local con mismo nombre que atributo. No es error de compilación.
        n=10; // acceso a variable local
        this.n=3; // acceso a variable atributo.
    }

    // Inicialización por defecto

    // Las variables locales No se inicializan por defecto. Es necesario asignarles un valor antes de utilizarlas.

    public void metodo(){
        int c;
        // c=c+3; // error de comiplación
    }

    // Las variables atributo: Se inicializan por defecto.
    // Enteras:0
    // Decimales: 0.0
    // Boolean: false
    // char: \u0000 -> "caracter nulo"
    // objeto: null

    int c;
    boolean car;
    public void metodo_(){
        c=c+3; // 0+3
        System.out.println(car); // false
    }


    // Variables Objeto y de tipo primitivo

    // Tipos primitivos. La variable contiene al dato
    int a = 200;

    // Tipos objeto. La variable contiene una referencia al dato para con el punto llamar a los métodos de ese objeto.
    Object ob = new Object();

    // Tipos primitivos. En una asignación, cada variable tiene una copia del dato.
    int r = 100;
    int y = r;

    // Tipos Objeto. Con variables objeto, ambas variables apuntan al mismo objeto.
    Object obj = new Object();

}
