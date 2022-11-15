package CursoJavaIndra.Genericos;

// Esto es una clase genérica
public class Cache <T> {

    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return this.t;
    }
}
