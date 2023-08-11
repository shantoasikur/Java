
package Lab3;

import java.util.Scanner;


public class star7 {
     public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println(" enter the size n: ");
        n=input.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            for(int k=0;k<n-i;k++){
            System.out.print("*");
                
        }
         
         System.out.println(" ");
    }
       
    
}
}

    

