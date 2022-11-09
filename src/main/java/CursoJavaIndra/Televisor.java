package CursoJavaIndra;

public class Televisor extends DispositivoElectronico {

    public Televisor(String marca) {
        super();
    }
    public Televisor() {
        super();
    }

    @Override
    public void encender(){

    }

    @Override
    public void apagar() {

    }

    public void cambiarCanal(){

    }

    public void inicializarPantalla(){

    }

    // no permite la sobreescritura de métodos cuando la clase padre tiene definidio el método como final
    // public final void mostrarMarca(){}




}
