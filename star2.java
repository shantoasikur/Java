
package Lab3;

import java.util.Scanner;


public class star2 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n;
        do{
            System.out.println("enter the size n : ");
             n=input.nextInt();
        }
        while(  n<0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" # ");
            }
            System.out.println(" ");
        
        
        
    }
        
    }
    
}
