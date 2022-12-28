public class Main {

  public static void main(String[] args) {
    //Conversiones explicitas
    double r = 45.3f;
    int g = (int)r; // Casting

    g+=10;
    System.out.println(g);

    // Tener siempre claro que las variables cuando están dentro de un metodo deben ser siempre inicializadas.
    // No se pueden utilizar las variables locales si no han sido inicializadas antes.
    double a,b,c;

    if(false){
      a=1.5;
      b=2;
      c=1;
    }


  }
}
