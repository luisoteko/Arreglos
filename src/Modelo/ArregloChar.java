package Modelo;

import java.util.Scanner;

public class ArregloChar {

  private char letras[];

  public ArregloChar(int tam){
    letras = new char[tam];
  }

  public void inicializarArreglo(){
    for (int i=0; i< letras.length; i++){
      letras[i] = ' ';
    }
  }
  public void imprimirArreglo(){
    for (char letra : letras) {
      System.out.print(" " + letra);
    }
  }
  public void capturarArreglo(){
    Scanner leer = new Scanner(System.in);
    for (int i=0; i<letras.length;i++){
      System.out.println("Digite la letra de las posicion [" + (i+1) +"]");
      letras[i] =  leer.next().charAt(0);
    }
  }

  public void seEncuentra(){
    Scanner leer = new Scanner(System.in);
    int i;
    System.out.println("\nPor favor digite el caracter a buscar");
    char buscado = leer.next().charAt(0);
    for (i = 0; i<letras.length; i++){
      if(letras[i] == buscado){
        System.out.println("El caracter "+ buscado + " se encontro en la posicion " + (i+1));
      }
      else if (i== letras.length-1){
        System.out.println("No se encontro el caracter");
      }
    }
  }
}
