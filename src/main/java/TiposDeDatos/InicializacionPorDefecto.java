package TiposDeDatos;


public class InicializacionPorDefecto {

    // Las variables locales no se inicializan por defecto. Es necesario asignarles un valor antes de utilizarlas.
    public void metodo(){
        int c;
        // c=c+3; // error de compilación
    }

    // Las variables de atributo si se inicializan por defecto.
    // Enteras = 0
    // Decimales = 0.0
    // Boolean = false
    // Char = '\u0000' (caracter nulo)
    // Objeto = null

    int c;
    boolean car;

    public void metod(){
        c=c+3; // 0 + 3;
        System.out.println(car); // false

    }

}
