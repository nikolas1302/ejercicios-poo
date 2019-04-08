
package ej.pkg72;

public class Ej72 {

    public static void main(String[] args) {
           int arreglo[]=new int [7];
           int c ;
           c=0;
           
           for (int i=3 ; i<=100 ;i++){
               int n=2 ;
           boolean pri = true ;
               while(pri && n!=i ){
            if(i%n==0){
                pri=false;
            }
            n=n+1;
               }
               if (pri){
               arreglo[c]=i ;
                   System.out.println(arreglo[c]+"es primo");
               }
           }   
           }
    }
    

