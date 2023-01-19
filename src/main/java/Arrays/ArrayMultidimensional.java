package Arrays;

public class ArrayMultidimensional {

  public static void main(String[] args) {
    // Se puede crear en Java arra de varias dimensiones:
    int [][] ar; // array de dos dimensiones
    int[] ar1 []; // también array de dos dimensiones
    int [][][] ar2; // array de tres dimensiones

    // Para crear el array se asigna tamaño a las dos dimensiones:
    ar1 = new int[3][4]; // array de 12 elementos
    ar2 = new int[2][5][10]; // array de 100 elementos;

    // El acceso a los elementos se realiza con un índice por dimensión:
    ar1[1][2]=23;
    ar2[0][3][2]=8;

    // RECORRIDO
    // Se pueden recorrer con un for estandar:
    int [][] nums = new int[5][7];
    for (int i = 0; i < nums.length; i++) { // longitud primera dimensión
      for (int j = 0; j < nums[i].length; j++) { // longitud segunda dimensión
        System.out.println(nums[i][j]);
      }
    }

    // o se puede utilizar un foreach
    for (int[] n : nums) {
      for (int s : n) {
        System.out.println(s);
      }
    }

    // ARRAYS IRREGULARES

    // A la hora de crear un array multidimensional, se pueden dejar las ultimas dimensiones sin asignar tamaño:
    int[][] d = new int[5][]; // Este array irregular representa que habrán 5 filas con un numero indistinto de columnas, puede que pa primer fila tenga 3 o 4 columnas y la segunda solo 2 columnas
    int [][][] n = new int[4][][]; // Este array irregular representa que habran 4 elementos los cuales cada uno de ellos puede tener dentro de si mismo una matriz con diferente tipo de dimensión
    int [][][] v = new int[2][10][]; // Tendremos en este caso dos filas, cada fila con 10 columnas pero cada columna a su vez puede almacenar un array de n cantidad de elementos
    // int [][][] h = new int[6][][4]; // Esto es un error de compilación, no se pueden dejar dimensiones intermedisas sin asignar un tamaño


    // A cada posición definida se le pueden asignar un array con tantas dimensiones como queden sin tamaño:
    d[0] = new int[4];
    d[2] = new int[7];
    n[1] = new int [4][2];
    v[0][0] = new int[6];

    // Ejemplos
    // Dado los siguientes arrays:
    int[] a = new int[10];
    long [][] b = new long [2][3];
    int [][] c = new int [3][];
    long [][][] e = new long[5][][];

    // Las siguientes instrucciones son correctas:
    b[0][0] = a[1];
    c[1] = a;
    e[0] = b;

    // Las siguientes instrucciones son incorrectas:
    // c[0][0] = a[1]; // no se ha dado tamaño a la segunda dimesnión. Esto arroja un NullPointerException debido a que aún no se ha definido el tamaño de la segunda dimensión
    // c[2] = a[3]; // en la primera dimensión de c se debe asignar un array
    // e[1]= a; //tiene que ser un array de dos dimensiones
    // e[0]=c; // misma dimensión pero es un array de int y no se puede asignar una variable array de long



    // CREACION ABREVIADA

    // igual que con los arrays de una dimensión, un array multidimensional puede declararse, crearse e inicializarse en una unica instrucción:
    int [][] datos = {{2,3},{1,7,6}};

    // Se pueden dejar las últimas dimensiones sin asignar tamaño e inicializarlas después:
    int[][] datos_ = new int [2][];
    datos_[0] = new int[]{3,4,5};
    // datos[1]={5,9}; // error, no se admite forma supersimplificada.
  }
}
