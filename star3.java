
package Lab3;

import java.util.Scanner;


public class star3 {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the row size n: ");
        int n=input.nextInt();
        int k=n*2-1;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k;j++){
                if(j==i || j==k-i+1)
                    System.out.print("*");
                    System.out.print(" ");
                   
            }
            System.out.println(" ");
         
        }
       
    }
   
}
    

