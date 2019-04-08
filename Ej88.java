
package ej.pkg88;

import java.util.Scanner;


public class Ej88 {


    public static void main(String[] args) {
        int num1 , num2 , res;
        Scanner entrada = new Scanner(System.in);
        System.out.println("escriba el numero a potenciar ");
        num1=entrada.nextInt();
        System.out.println("escriba potencia ");
        num2= entrada.nextInt();
        res = potencia(num1,num2);
        System.out.println("la potencia es :"+res);
        
 
    }
    public static int potencia (int a , int b){
        int r ;
        r=a;
        for (int i=1;i<b;i++){
        r=r*a;
        }
        return r ;
    }
    
}
