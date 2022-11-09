package CursoJavaIndra;

public abstract class DispositivoElectronico {

    public DispositivoElectronico() {
        this.marca = null;
    }

    private String marca;
    public abstract void encender();
    public abstract void apagar();

    public final void mostrarMarca(){
        System.out.println("La marca del dispositivo" + marca);
    }

}
