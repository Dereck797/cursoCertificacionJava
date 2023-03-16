package EstructurasRepetitivas;

public class InstriccionesBreakyContinue {

  public static void main(String[] args) {
    // Provocan una salida forzada
    // break: Abandona el bucle
    // continue: Pasa a la siguiente iteración
    // Ambas instrucciones pueden utilizarse tanto en for como en while

    // En este caso se provoca la salida de la instrucción repetitiva, pasando el control del programa a la siguiente instrucción.
    int n=0;
    int s= 0;
    for (int i = 1; i < n; i++) {
      s+=1;
      if(s>100){
        break;
      }
    }

    // En este caso pasa a la siguente iteración del bucle. En el caso de un for, la llamada a continue nos llevaría directamente a la instrucción de incremento
    // muestra los números del 1 al 10, menos el 5
    for (int i = 0; i <10 ; i++) {
      if(i==5){
        continue;
      }
      System.out.println(i);
    }

    // --------------------------------------------

    // Bucles etiquetados
    // Es posible asignar una etiqueta a una intrucción for o while
    // En bucles anidados, permite a las instrucciones break o continue indicar el bucle que se quiere abandonar
    // Si no se indica etiqueta despue´s de brak/continue, afectará al bucle más interno.

  }
}

class TestBuclesAnidados {
  public static void main(String[] args) {
    int a=0,s=0,i=1;
    principal:
    for (; i <10 ; i++) {
      while (a<5){
        a=i++;
        s=a+i;
        if(s>=10){
          break principal;
        }
      }
    }
    System.out.println(i+":"+a+":"+s);
  }
}
