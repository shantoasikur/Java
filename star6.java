
package Lab3;

import java.util.Scanner;


public class star6 {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*i-2;k++){
                System.out.print(" ");
            }
            for(int l=i;l<=n;l++){
                System.out.print("*");
            }
            System.out.println(" ");
           
        }
         for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*i-2;k++){
                System.out.print(" ");
            }
            for(int l=i;l<=n;l++){
                System.out.print("*");
            }
            System.out.println(" ");
           
        }
    }
   
}

    

