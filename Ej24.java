
package ej.pkg24;

import java.util.Scanner;


public class Ej24 {


    public static void main(String[] args) {
        float n ;
        Scanner entrada=new Scanner(System.in) ;
        System.out.println("digite un numero a comparar si es positivo o negativo ");
        n=entrada.nextFloat() ;
        if (n<0)
            System.out.println("el numero es negativo"); 
        else
            if (n>0)
                System.out.println("el numero es positivo");
            else
                System.out.println("el numero es 0");
        
            
        }
                
    }
    

