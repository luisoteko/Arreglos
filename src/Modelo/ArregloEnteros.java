package Modelo;

import java.util.Scanner;

public class ArregloEnteros {

  private int[] numeros;

  public ArregloEnteros(int tam){
    numeros = new int[tam];
  }

  public void inicializarArreglo(){
    for (int i=0; i< numeros.length; i++){
      numeros[i] = 0;
    }
  }
  public void imprimirArreglo(){
    for (int i=0; i < numeros.length; i++){
      System.out.print(" "+numeros[i]);
    }
    System.out.print("\n");
  }
  public void capturarArreglo(){
    Scanner leer = new Scanner(System.in);
    for (int i=0; i<numeros.length;i++){
      System.out.println("Digite el numero de las posicion [" + (i+1) +"]");
      numeros[i] = leer.nextInt();
    }
  }

  public void Invertir(){
    int j = numeros.length;
    int[] result = new int[j];

    for (int i =0; i<numeros.length; i++){
      result[j - 1] = numeros[i];
      j--;
    }
    numeros = result;
  }

  public int vecesMayor(){
    int aux = 0;
    int max = max(numeros);
    for (int i=0; i<numeros.length; i++){
      if (max==numeros[i]){
        aux++;
      }
    }
    return aux;
  }
  public int max(int[] numeros){
    int max = 0;
    for (int i=0; i<numeros.length; i++){
      if (max < numeros[i]){
        max = numeros[i];
      }
    }
    return max;
  }

  public int[] Primos(){
    int[] q = new int[numeros.length];
    for (int i=0; i<numeros.length; i++){
      int j = numeros[i];
      int contador = 0;
      for (int k=1; k<=j;){
        if (j%k==0){
          contador++;
          k++;
        }
      }
      q[i]= contador;
    }
    return q;
  }



  public int[] getNumeros() {
    return numeros;
  }

  public void setNumeros(int[] numeros) {
    this.numeros = numeros;
  }
}
