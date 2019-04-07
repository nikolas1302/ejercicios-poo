
package ej.pkg44;

import java.util.Scanner;

public class Ej44 {

    public static void main(String[] args) {
        int n , c , f;
        c=1;
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("digite numero a calcular factorial ");
        n=entrada.nextInt() ;
        while (n!=0){
        c=c*n;
        n=n-1;
        
        }
         System.out.println("el factorial es = "+c);   
    }
    
}
