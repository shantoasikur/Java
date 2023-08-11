
package Lab3;

import java.util.Scanner;


public class reverseNumberPattern {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size n: ");
        int n=input.nextInt();
        int i=1;
        while(i<=n){
            int j=n-i;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            int k=i;
            while(k>0){
                System.out.print(k);
                k--;
               
            }
            int l=2;
            while(l<=i){
                System.out.print(l);
                l++;
            }
            System.out.println(" ");
            i++;
        }
   
}
}

    

