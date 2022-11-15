package CursoJavaIndra;

public class BotonCrear implements IButton{

    @Override
    public String clickIzquierdo() {
        return "Presiona el click isquierdo";
    }

    @Override
    public String clickDerecho() {
        return "Invoca servicio Derecho";
    }
}
