
package ej.pkg60;

public class Ej60 {

    public static void main(String[] args) {
   int num[] =new int[7];
   int may ;
   may=0;
   num[0]=23;
   num[1]=45;
   num[2]=68; 
   num[3]=99;
   num[4]=10;
   num[5]=15;
   num[6]=4;
  for (int i =1;i<=6;i++){
       if (num[i]>may) {
       may =num[i] ;}
       }
        System.out.println("el mayor es :"+may);
   }
           
    }
    

