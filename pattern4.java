
package Lab3;

import java.util.Scanner;


public class pattern4 {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" enter the size n: ");
        n=input.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
            System.out.print(k);
                
        }
            System.out.println(" ");
        
    }
    
}
}

    

