package CursoJavaIndra.practica6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {



        List<Persona> PersonaList = crearPersona();

        System.out.println("Grupo 1 ");
        PersonaList.stream()
                .filter(p -> p.getEdad() > 80 || p.getProfesion() == String.valueOf(PersonType.PROFESIONAL_SALUD))
                .filter(p -> p.getPrimeraLinea() == true).forEach(p -> System.out.println(p.getNombre()));

        System.out.println("Grupo 2 ");
        PersonaList.stream()
                .filter(p -> (p.getEdad() > 60 && p.getEdad() < 79) || (p.getProfesion() == String.valueOf(PersonType.PROFESIONAL_SALUD) && p.getPrimeraLinea() == false))
                .forEach(p -> System.out.println(p.getNombre()));

        System.out.println("Grupo 3 ");
        PersonaList.stream()
                .filter(p -> p.getEdad() > 12 && p.getEdad() < 59)
                .filter(p -> p.getComorbilidades() == true)
                .filter(p -> p.getProfesion() == String.valueOf(PersonType.PROFESORES) || p.getProfesion() == String.valueOf(PersonType.MILITARES))
                .forEach(p -> System.out.println(p.getNombre()));

        System.out.println("Grupo 4 ");
        PersonaList.stream()
                .filter(p -> p.getEdad() > 12 && p.getEdad() < 59)
                .filter(p -> p.getComorbilidades() == true)
                .filter(p -> p.getProfesion() == String.valueOf(PersonType.PROFESORES) || p.getProfesion() == String.valueOf(PersonType.MILITARES))
                .forEach(p -> System.out.println(p.getNombre()));
    }

    public static List<Persona> crearPersona() {
        List<Persona> personas = new ArrayList<>();

        Persona persona1 = new Persona.Builder("Dereck", "Muñoz")
                .edad(81L)
                .profesion(String.valueOf(PersonType.EXCLUYENTE))
                .primeraLinea(true)
                .comorbilidades(false)
                .build();

        Persona persona2 = new Persona.Builder("Angie", "Martinez")
                .edad(35L)
                .profesion(String.valueOf(PersonType.PROFESIONAL_SALUD))
                .primeraLinea(true)
                .comorbilidades(false)
                .build();

        Persona persona3 = new Persona.Builder("Pepito", "Perez")
                .edad(81L)
                .profesion(String.valueOf(PersonType.PROFESIONAL_SALUD))
                .primeraLinea(false)
                .comorbilidades(false)
                .build();

        Persona persona4 = new Persona.Builder("Andrés", "Caceres")
                .edad(35L)
                .profesion("Calle 200")
                .primeraLinea(true)
                .comorbilidades(false)
                .build();

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        return personas;

    }
}
