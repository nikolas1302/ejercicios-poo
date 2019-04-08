
package j68;


public class J68 {

    public static void main(String[] args) {
         int matriz [][]=new int [2] [5];
         matriz[0][0]=5;
         matriz[0][1]=6;
         matriz[0][2]=7;
         matriz[0][3]=9;
         matriz[1][0]=11;
         matriz[1][1]=8;
        matriz[1][2]=2;
         matriz[1][3]=0;
         
         for (int i = 0; i<=3;i++){
         matriz[0][4]=(matriz[0][4])+(matriz[0][i]);
         matriz[1][4]=(matriz[1][4])+(matriz[1][i]);
         
         
         }
         System.out.println(matriz[0][4]);
         System.out.println(matriz[1][4]);
         }
             
         
    }
    
}
