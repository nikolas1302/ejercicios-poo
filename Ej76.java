
package ej.pkg76;

import java.util.Scanner;


public class Ej76 {

    public static void main(String[] args) {
        String original ;
        String blancos ;
        Scanner entrada =new Scanner(System.in);
        System.out.println("escriba la cadena de caracteres");
       original=entrada.next();
       blancos=original ;
           blancos=blancos.replace(" ","") ;
           System.out.println(blancos);
       
        
    }
    
}
