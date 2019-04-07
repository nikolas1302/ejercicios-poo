
 
package ej16;

import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {
        float co,ca ;
        double h ;
        Scanner entrada =new Scanner(System.in) ;
        System.out.println("para hallar la hipotenusa de un triangulo rectangulo digite");
        System.out.println("cateto opuesto :");
        co=entrada.nextFloat() ;
        System.out.println("cateto adyacente :");
        ca=entrada.nextFloat();
        h=Math.sqrt((co*co)+(ca*ca)) ;
        System.out.println("la hipotenusa es = "+ h );
    }
    
}
