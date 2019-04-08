
package ej.pkg56;

import java.util.Scanner;


public class Ej56 {


    public static void main(String[] args) {
        int n ;
       int numeros[] =new int [5] ;
       int copia[]= new int [5] ;
        Scanner entrada =new Scanner(System.in);
        System.out.println("elija el numero a iniciar arreglo ");
        n=entrada.nextInt();
        for (int i=0;i<=4;i++) {
            numeros[i]=n;
            copia[i]=numeros [i];
            n=n+1;
        }
        System.out.println(numeros[2]);
        }
    }
    

