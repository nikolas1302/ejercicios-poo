
package ej.pkg84;

import java.util.Scanner;

public class Ej84 {

    public static void main(String[] args) {
    String cad1 ;
    String cad2 ;
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("escriba cadenas a comparar");
        cad1=entrada.next();
        cad2=entrada.next() ;
        if (cad1==cad2) {
        System.out.println("son iguales ");}
        else {
        System.out.println("no son iguales ");}
        
    }
    
}
