package CursoJavaIndra.practica2;

import CursoJavaIndra.example1.CalculoVentas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        estudiantes.add(new Estudiante("Pepito perez", "D", "", 12l,"Bogota"));
        estudiantes.add(new Estudiante("Andrés", "A", "", 12l,"Bogota"));
        estudiantes.add(new Estudiante("Juan", "A", "", 12l,"Bogota"));
        estudiantes.add(new Estudiante("Carlos", "A", "", 12l,"Bogota"));
        estudiantes.add(new Estudiante("Pedro", "A", "", 12l,"Bogota"));
        estudiantes.add(new Estudiante("Pepito perez", "A", "", 12l,"Bogota"));
        estudiantes.add(new Estudiante("Pepito perez", "A", "", 12l,"Bogota"));
        estudiantes.add(new Estudiante("Pepito perez", "A", "", 12l,"Bogota"));
        estudiantes.add(new Estudiante("Pepito perez", "A", "", 12l,"Bogota"));
        estudiantes.add(new Estudiante("Pepito perez", "A", "", 12l,"Bogota"));

        for ( Estudiante estudiante: estudiantes ) {
            IEstudiante mayusculas = (n,a) -> n.toUpperCase() + a.toUpperCase();


        }




    }
}
