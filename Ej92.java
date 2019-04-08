
package ej.pkg92;

import java.util.Scanner;

public class Ej92 {

    public static void main(String[] args) {
        float num1,num2, precio ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite el precio de las unidades a comprar ");
        num1=entrada.nextFloat();
        System.out.println("digite el numero de unidades a comprar ");
        num2=entrada.nextFloat();
        precio = descuento(num1,num2);
        System.out.println("el precio final es :"+precio);
        
    }
    public static float descuento (float a ,float b){
    float desc ;
    if  (b <13){
        if(b<6){
            desc=1;}
        else {
            desc=(float) 0.04 ;}
    }
    else {
        desc=(float ) 0.1;
    }
        return((a*b)*desc); 
                }
    }

