package TiposDeDatos;
//------------------------------------------------------------------------------------
// AMBITO DE LAS VARIABLES

// las variables pueden declararse:
// En el interior de un método, se les conoce como locales solo visibles dentro de ese método.

// A nivel de clases compartidas por todos los metodos. Se les conoce como atributos o campos.

public class AmbitoDeVariables {
    int n; // Variable atributo o de clase

    public void metodo(){
        int c; // Variable local o de metodo
        int n; // Local con mismo nombre que atributo
        n=10; // Acceso a variable local
        this.n = 3; // Acceso a variable atributo
    }
}
