
package Lab3;

import java.util.Scanner;


public class Pattern1 {
      public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the row size n: ");
        int n=input.nextInt();
       
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
    

