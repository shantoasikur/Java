
package Lab3;

import java.util.Scanner;


public class reverseNumber {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the year n: ");
        int n=input.nextInt();
        int reverseNumber=0;
        int remainder;
        
        for(;n!=0;){
            remainder=n%10;
            reverseNumber=reverseNumber*10+remainder;
            n=n/10;
            
        }
         System.out.println("reverseNumber: "+reverseNumber);
            
        }
    
}
