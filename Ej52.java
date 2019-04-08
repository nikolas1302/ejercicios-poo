
package ej.pkg52;

import java.util.Scanner;


public class Ej52 {

    public static void main(String[] args) {
    float n,c ;
    c=0;
        Scanner entrada = new Scanner(System.in) ;
    for (int i =1 ;i<=10 ;i++){
        System.out.println("digite numeros a sumar (solo los negativos se sumaran )");
        n=entrada.nextFloat();
        if (n<0)
            c=c+n ;
        
    }
        
    System.out.println("la suma es : "+c);
    }
    
}
