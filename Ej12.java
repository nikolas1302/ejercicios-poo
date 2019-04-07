
package ej12;

import java.util.Scanner;


public class Ej12 {


    public static void main(String[] args) {
        float a,b,c,res ;
        Scanner entrada=new Scanner(System.in) ;
        System.out.println("para evaluar la exprecion : (a+7*c)/(b+2-a)+2*b ");
        System.out.println("digite el valor de a");
        a=entrada.nextFloat() ;
        System.out.println("digite el valor de b ");
        b=entrada.nextFloat();
        System.out.println("escriba el valor de c ");
        c=entrada.nextFloat() ;
        res =(a+7*c)/(b+2-a)+2*b;
        System.out.println("la respuesta es : "+ res);
    }
    
}
