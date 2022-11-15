package CursoJavaIndra.Genericos;

import CursoJavaIndra.practica2.Estudiante;

public class CacheEstudiante<Estudiante> {

    private Estudiante t;

    public void add(Estudiante t){
        this.t = t;
    }

    public Estudiante get(){
        return this.t;
    }
}
