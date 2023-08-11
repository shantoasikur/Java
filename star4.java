
package Lab3;

import java.util.Scanner;


public class star4 {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n=input.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
               
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
               
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
}
}

    

