package CursoJavaIndra.example1;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String t = "Hola a todos";
        String s = "todos";

        IStringUtils su = new IStringUtils() {
            @Override
            public String transformar(String s) {
                return s.toUpperCase();
            }
        };

        IStringUtils su2 = (a) -> a.toUpperCase(); // La interfaz es para que la expresión lambda pueda inferir la firma.


        System.out.println(su.transformar("Dereck Sebastián Muñoz"));
        System.out.println(su2.transformar("Dereck Sebastián Muñoz Castiblanco"));

    }

}
