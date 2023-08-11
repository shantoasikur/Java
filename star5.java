
package Lab3;

import java.util.Scanner;

public class star5 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n;
        System.out.println("enter the size n: ");
        n=input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.printf(" ");
                
            }
            for(int k=0;k<2*i+1;k++){
                System.out.printf("#");
            }
             for(int j=0;j<n-i;j++){
                System.out.printf(" ");
             }
             System.out.println(" ");
        }
       
        }
     
    }
    

