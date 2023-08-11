
package Lab3;

import java.util.Scanner;


public class palindrome {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("enter the number n: ");
        n=input.nextInt();
        int remainder,reverse=0;
        int temp=n;
        while(temp!=0){
        remainder=temp%10;
        reverse =reverse*10+remainder;
        temp=temp/10;
        }
        if (n==temp){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
        
        
        
    }
    
}
