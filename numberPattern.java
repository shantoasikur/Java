
package Lab3;

import java.util.Scanner;


public class numberPattern {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size n: ");
        int n=input.nextInt();
        int i=1;
        while( i<=n){
            int j=n-i;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            int k=2*i-1;
            while(k>0){
                System.out.print(i);
                k--;
            }
            System.out.println(" ");
            i++;
       
       
    }
    }
}

    

