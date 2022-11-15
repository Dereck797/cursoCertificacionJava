package CursoJavaIndra.Practica3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arreglo = new ArrayList<String>();
        arreglo.add("1");
        arreglo.add("2");
        arreglo.add("3");
        arreglo.add("4");

        ArrayList<Integer> arreglo2 = new ArrayList<Integer>();
        arreglo2.add(1);
        arreglo2.add(3);
        arreglo2.add(5);
        arreglo2.add(6);

        Imprimir calculo = new Imprimir();


        calculo.imprimir(arreglo2);


        Max maximo = new Max();

        System.out.println();
        System.out.println(maximo.maximo(1,2,3));
        System.out.println();
        System.out.println(maximo.maximo('1',"a","q"));


    }

}
