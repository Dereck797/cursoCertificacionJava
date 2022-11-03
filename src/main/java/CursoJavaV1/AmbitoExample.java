package CursoJavaV1;

public class AmbitoExample {

    /*Las variables puedne declararse:     */
    // A nivel de la clase, compartida por todos los métodos de la clase. Se les conoce como atributos o campos.
    int c;

    public void main(String[] args) {

        // En el interior de un método. Se les conoce como locales. Solo visibles dentro del mismo método
        int a; // Variable local
        int c;  // Local con el mismo nombre del atributo
        c = 10; // Acceso a variable local
        this.c = 3; // Acceso a variable atributo

    }
}
