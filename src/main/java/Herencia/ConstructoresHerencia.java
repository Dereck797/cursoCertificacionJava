package Herencia;

public class ConstructoresHerencia {

  public static void main(String[] args) {
    Clase3 c = new Clase3();
  }

}

class Clase1{
  Clase1(){
    System.out.println("C1");
  }
}

class Clase2 extends Clase1{
  Clase2(){
    System.out.println("C2");
  }
}

class Clase3 extends Clase2{
  Clase3(){
    System.out.println("C3");
  }
}