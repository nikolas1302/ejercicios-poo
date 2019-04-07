
package ej40;

import java.util.Scanner;




public class Ej40 {


    public static void main(String[] args) {
        String r;
        boolean v =false ;
        Scanner entrada = new Scanner(System.in) ;
       while(v==false){
           System.out.println("¿Desea continuar S/N?");
           r=entrada.next() ;
           if (r!="n")
               v=true ;
           else 
               v=false ;
                    
        }
        
    }
    
}
