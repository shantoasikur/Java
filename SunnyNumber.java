
package Lab3;

import java.util.Scanner;


public class SunnyNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number n: ");
        int n=input.nextInt();
        int nextValue;
        nextValue=n+1;
        double squareRoot=Math.sqrt(nextValue);
        if((squareRoot-Math.floor(squareRoot)==0)){
            System.out.println("sunny number");
        }
        else{
            System.out.println("not sunny number");
        }
        
        
    }
    
}
