import Modelo.ArregloDouble;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    System.out.println("Por favor ingrese el tamaño del arreglo");
    Scanner leer = new Scanner(System.in);
    int tam = leer.nextInt();

    System.out.println("Arreglo 1\n");

    ArregloDouble arr1 = new ArregloDouble(tam);
    arr1.inicializarArreglo();
    arr1.capturarArreglo();
    System.out.println(arr1.maxNota());
//    arr1.imprimirArreglo();
//    arr1.seEncuentra();

//    System.out.println("\nArreglo 2\n");
//    Modelo.ArregloEnteros arr2 = new Modelo.ArregloEnteros(tam);
//    arr2.inicializarArreglo();
//    arr2.capturarArreglo();
//    arr2.imprimirArreglo();
//
//    Modelo.ArregloEnteros arr3 = arr1.sumarArreglos(arr1, arr2, tam);
//    System.out.println('\n');
//    arr1.setNumeros(arr1.Invertir());
//
//    arr1.imprimirArreglo();
  }

}
