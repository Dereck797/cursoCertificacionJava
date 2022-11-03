package CursoJavaV1;

public class Pruebas {

    public static void main(String[] args) {
        String seccion = "123456789012345679823984938293849382938498888888888888888888888888888888884738473874893748374848474747447477429347982347289734928347293847239874923874897234";
        System.out.println(seccion.length());
        metodo(String.valueOf(seccion).substring(0,89));
    }


    public static String metodo(String valor){
        System.out.println(valor.length());
        return " ";
    }
}
