package Controlador;

import Modelo.ArregloDouble;
import Modelo.ArregloEnteros;

import java.util.Arrays;
import java.util.Scanner;

public class Controlador {
  public static void controlador(){
    Scanner leer = new Scanner(System.in);
    System.out.println("Por favor digite el numero de su eleccion. \n" +
      "1. Invertir Arreglo \n" +
      "2. Notas (incluye: Promedio, Calificacion mayor y menor, alumnos sobre el promedio y numero de aprobados y reprobados) \n" +
      "3. Cuantas veces esta repetido el mayor\n" +
      "4. Calcular factorial de los numeros\n" +
      "5. Numero con mas primos");
    int opcion = leer.nextInt();

    System.out.println("Por favor ingrese el tamaño de su arreglo");
    int tam = leer.nextInt();

    switch (opcion) {
      case 1:
        ArregloEnteros arr1 = new ArregloEnteros(tam);
        arr1.inicializarArreglo();
        arr1.capturarArreglo();
        arr1.imprimirArreglo();
        arr1.Invertir();
        arr1.imprimirArreglo();
        break;
      case 2:
        ArregloDouble arr2 = new ArregloDouble(tam);
        arr2.inicializarArreglo();
        arr2.capturarArreglo();
        arr2.imprimirArreglo();
        System.out.println("\n Nota Mayor: " + arr2.maxNota());
        System.out.println("\n Nota Menor: " + arr2.minNota());
        System.out.println("Promedio: " + arr2.promedio());
        System.out.println("Sobre el promedio: " + arr2.superPromedio());
        System.out.println("\n Aprobados: " + arr2.aprobados());
        System.out.println("\n Reprobados: " + arr2.reprobados());
        break;
      case 3:
        ArregloEnteros arr3 = new ArregloEnteros(tam);
        arr3.inicializarArreglo();
        arr3.capturarArreglo();
        arr3.imprimirArreglo();
        System.out.println("El numero mayor se repite: " + arr3.vecesMayor() + " veces");
        break;
      case 4:
        ArregloDouble arr4 = new ArregloDouble(tam);
        arr4.inicializarArreglo();
        arr4.capturarArreglo();
        arr4.imprimirArreglo();
        arr4.factorialToArray().imprimirArreglo();
        break;
      case 5:
        ArregloEnteros arr5 = new ArregloEnteros(tam);
        arr5.inicializarArreglo();
        arr5.capturarArreglo();
        int[] q = arr5.Primos();
        Arrays.sort(q);
        arr5.setNumeros(q);
        System.out.println(arr5.max(q));
    }
  }
}
