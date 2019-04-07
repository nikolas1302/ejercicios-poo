
package ej8;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        int bas,alt,are ;
       Scanner entrada=new Scanner(System.in);
        System.out.println("digite la base del triangulo :");
      bas=entrada.nextInt();
        System.out.println("digite la altura del triangulo :");
        alt=entrada.nextInt();
       are=(bas*alt)/2 ;
         System.out.println("el area del triangulo es = "+are);
    }
    
}
