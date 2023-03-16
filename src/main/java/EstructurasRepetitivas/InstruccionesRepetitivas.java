package EstructurasRepetitivas;

public class InstruccionesRepetitivas {


  public static void main(String[] args) {
    // El ciclo for ejecuta un grupo de instruccones un número determinado de veces
    // Desde que la variable toma el valor de inicialización hasta que la condición deje de cunmplirse, se ejecutará el bloque de onstrucciones
    for (int i = 0; i < 4; i++) {
      System.out.println(i);
    }
    // CONSIDERACIONES
    // Las llaves son obligatorias si hay más de una instrucción
    // Las tres instrucciones de control son opcionales:
    // Ejemplo, muestrA LOS NUMEROS DEL 1 AL 9
    int j = 1;
    for (; j < 10;) { // los ";" se ponene igualmente- Si no se indicace instrucción de control, tendriamos bucle infinito
      System.out.println(j);
      j++;
    }

    // Las instrucciones de control pueden contener más de una sentencia, separadas por una coma:
    for(int a=0, b=10; a<b; a++, b--){

    }




    //--------------------------------------------------------------------------------------


    // INSTRUCCIÓN FOREACH
    // Se utiliza para el recorrido en modo lectura de arrays y colecciones
    // La variable de control va pasando por todas las posiciones del array, NO es un indice. n no sé utiliza como un indice
    int[] nums = {4,8,1,5};
    for (int n: nums) {
      System.out.println(n); // n apunta en cada iteración a cada uno de los elementos del array
    }

    // ---------------------------------------------------------------------------------------
    // Ejecuta un grupo de instrucciones mientras se cumpla una condición (Cuando el resultado sea true)
    // La condición puede evaluarse al principio, o despues de ejecutar el bloque de instrucciones:
    int w= 0, s=0;
    while(s <1000){
      s+=w++;
    }


    int q=0;
    do {
      System.out.println(q);
    }while(q<0);
  }
}
