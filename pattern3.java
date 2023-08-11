
package Lab3;

import java.util.Scanner;


public class pattern3 {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" enter the size n: ");
        n=input.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println(" ");
                
        }
        
    }
    
}

    

