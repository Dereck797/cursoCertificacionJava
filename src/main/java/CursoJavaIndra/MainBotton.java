package CursoJavaIndra;

public class MainBotton {
    public static void main(String[] args) {

        new IButton(){
            @Override
            public String clickIzquierdo() {
                return null;
            }

            @Override
            public String clickDerecho() {
                return "Algo diferente";
            }

            @Override
            public String toString() {
                return "Button 13 2 2";
            }

        };
    }
}
