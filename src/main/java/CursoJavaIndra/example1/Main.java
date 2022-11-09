package CursoJavaIndra.example1;

public class Main {

    public static void main(String[] args) {

        StringsUtil util = new StringsUtil();
        if(util.continene("tomorrow","to")){
            System.out.println("Lo contiene");
        }

        String t = "Hola a todos";
        String s = "todos";

        IStringsUtil contains = (t,s) -> t.contains(s);

    }

}
