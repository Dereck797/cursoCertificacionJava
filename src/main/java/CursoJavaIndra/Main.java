package CursoJavaIndra;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Main {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<>();
        notas.add(45.3);
        notas.add(48.3);
        notas.add(43.3);
        notas.add(41.3);
        Estudiante estudiante = new Estudiante("Dereck","Muñoz","Masculino",23l,"Bogota",notas);
        ToDoubleFunction<Estudiante> notaPromedio = p -> p.getNotas().stream().mapToDouble(e-> e).sum() / p.getNotas().stream().count();
        System.out.println(notaPromedio.applyAsDouble(estudiante));
    }
}
