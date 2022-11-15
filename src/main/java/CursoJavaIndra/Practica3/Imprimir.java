package CursoJavaIndra.Practica3;

import java.util.List;

public class Imprimir <T> {


    private T t;

    public void imprimir(List<T> t){
        for (T e : t) {
            System.out.println(e);
        }
    }

}
