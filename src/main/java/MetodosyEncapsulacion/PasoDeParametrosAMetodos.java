package MetodosyEncapsulacion;

public class PasoDeParametrosAMetodos {

  // Al pasar un tipo primitivo a un método, estamos pasando una copia del dato.
  // Si el método modifica su copia, no afecta al original.
  public static void main(String[] args) {
    int n = 5;
    modif(n);
    System.out.println(n);

    // Al pasar un tipo objeto a un método, estamos pasando una copia de la referencia al objeto.
    StringBuilder sb = new StringBuilder("hello");
    modif(sb);
    System.out.println(sb); // Ambas variables estarían apuntando al mismo objeto
    // hello bye

    // Recuerda que las cadenas, aunque son objetos, son inmutables.
    String sbb = "hello";
    modif(sbb);
    System.out.println(sbb); // Hello
    // Aunque inicialmente apunta al mismo objeto, tras la concatenación se genera un nuevo objeto al que apunta la variable parámetro
  }


  public static void modif(int a){
    a=a+3;
  }

  public static void modif(StringBuilder d){
    d.append("bye");
  }

  public static void modif(String d){
    d+="bue";
  }


}
