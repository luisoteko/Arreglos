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
    for (int numero : numeros) {
      System.out.print(" " + numero);
    }
    System.out.print("\n");
  }
  public void capturarArreglo(){
    Scanner leer = new Scanner(System.in);
    for (int i=0; i<numeros.length;i++){
      System.out.println("Digite el numero de las posicion [" + (i+1) +"]");
      numeros[i] = leer.nextInt();
    }
    leer.close();
  }

  public void Invertir(){
    int j = numeros.length;
    int[] result = new int[j];

    for (int numero : numeros) {
      result[j - 1] = numero;
      j--;
    }
    numeros = result;
  }

  public int vecesMayor(){
    int aux = 0;
    int max = max(numeros);
    for (int numero : numeros) {
      if (max == numero) {
        aux++;
      }
    }
    return aux;
  }
  public int max(int[] numeros){
    int max = 0;
    for (int numero : numeros) {
      if (max < numero) {
        max = numero;
      }
    }
    return max;
  }

  public int[] primos(){
    int[] q = new int[numeros.length];
    for (int numero: numeros){
      int i=0;
      int j = numero;
      int contador = 0;
      for (int k=1; k<=j;){
        if (j%k==0){
          contador++;
          k++;
        }
      }
      q[i]= contador;
      System.out.println(q[i]);
      i++;
    }
    return q;
  }

  public String partidario(){
    String r="";
    for (int i=0; i<numeros.length; i++){
      for (int j=1; j<numeros.length; i+=2){
        if (numeros[i]<numeros[j]){
          r="Partidario";
        }
        else{
          r="No partidario";
        }
      }
    }
    return r;
    //TODO: Hacer esta madre bien.
  }



  public int[] getNumeros() {
    return numeros;
  }

  public void setNumeros(int[] numeros) {
    this.numeros = numeros;
  }
}
