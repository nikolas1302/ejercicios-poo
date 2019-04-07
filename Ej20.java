
package ej.pkg20;

import java.util.Scanner;


public class Ej20 {


    public static void main(String[] args) {
        double m,p ;
        Scanner entrada  = new Scanner(System.in) ;
        System.out.println("digite el numero de metros a convertir a pies ");
        m=entrada.nextFloat() ;
        p=m*(3.2808) ;
        System.out.println("los "+ m + " metros equivalen a "+p+" pies");
    }
    
}
