
package ej.pkg48;

import java.util.Scanner;


public class Ej48 {

   
    public static void main(String[] args) {
        int c, n ;
        boolean pri=true ;
        c=2 ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite numero a mirar si es primo");
        n=entrada.nextInt();
        while(pri && c!=n ){
            if(n%c==0)
                pri=false;
            c=c+1;
            
      
        }
          if (pri)
                System.out.println("el numero es primo ");
            
            else
            
                System.out.println("el numero no es primo ");
            
            
    }
    
}
