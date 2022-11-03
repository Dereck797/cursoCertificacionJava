package CursoJavaV1;

public class TypeConversions {

    // Todos los tipos de datos primitivos son convertibles en otros, salvo boolean.

    public static void main(String[] args) {

        // Las conversiones pueden ser de dos tipos:
        // Implicitas
        int x = 45;
        Double n = Double.valueOf(x);
        System.out.println(n.getClass());

        // Explicitas
        double r = 4.5f;
        Integer a = Integer.valueOf((int)r);
        System.out.println(a.getClass());
    }
}
