package Modelo;

import java.util.Scanner;
import java.util.Arrays;

public class ArregloDouble {

  private double numeros[];

  public ArregloDouble(int tam) {
    numeros = new double[tam];
  }

  public void inicializarArreglo() {
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = ' ';
    }
  }

  public void imprimirArreglo() {
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(" " + numeros[i]);
    }
    System.out.print("\n");
  }

  public void capturarArreglo() {
    Scanner leer = new Scanner(System.in);
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Digite la letra de las posicion [" + (i + 1) + "]");
      numeros[i] = leer.nextDouble();
    }
  }

  public double promedio() {
    double sum = 0;
    for (int i = 0; i < numeros.length; i++) {
      sum += numeros[i];
    }
    double prom = sum / numeros.length;
    return prom;
  }

  public double maxNota() {
    double max = 0;
    for (int i=0; i<numeros.length; i++){
      if (max < numeros[i]){
        max = numeros[i];
      }
    }
    return max;
  }

  public double minNota() {
    return numeros[0];
  }

  public int superPromedio() {
    double prom = promedio();
    int aux = 0;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > prom) {
        aux++;
      }
    }
    return aux;
  }

  public int aprobados() {
    int aux = 0;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > 3) {
        aux++;
      }
    }
    return aux;
  }

  public int reprobados() {
    int aux = 0;
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] < 3) {
        aux++;
      }
    }
    return aux;
  }

  public ArregloDouble factorialToArray() {
    double[] arrResult = new double[numeros.length];
    for (int i = 0; i < numeros.length; i++) {
      arrResult[i] = this.factorial(i);
    }
    ArregloDouble result = new ArregloDouble(numeros.length);
    result.setNumeros(arrResult);

    return result;
  }

  public double factorial(int i) {
    double factorial;
    factorial = 1;
    for (double j = numeros[i]; j > 0; j--) {
      factorial *= j;
    }
    return factorial;
  }

  public void setNumeros(double[] numeros) {
    this.numeros = numeros;
  }
}
