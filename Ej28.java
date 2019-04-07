
package ej.pkg28;

import java.util.Scanner;

public class Ej28 {

    public static void main(String[] args) {
        int n ;
        Scanner entrada = new Scanner(System.in) ;
        System.out.println("escriba el dia de la semana del 1 al 7");
        n=entrada.nextInt() ;
        switch (n) {
           case 1: 
                System.out.println("lunes");
           break ;
           case 2: 
                System.out.println("martes");
            break ;
            case 3: 
                System.out.println("miercoles");
            break ;
            case 4: 
                System.out.println("jueves");
            break ;
            case 5: 
                System.out.println("viernes");
            break ;
            case 6: 
                System.out.println("sabado");
            break ;
            case 7: 
                System.out.println("domingo");
            break ;
            default :
                System.out.println("dia invalido ");
            break ;
            }
        
    }
    
}
