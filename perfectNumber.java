/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class perfectNumber {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        int N=input.nextInt();
        for(int i=1;i<=N;i++){
            int X=input.nextInt();
            int sum=0;
            for(int j=1;j<=X/2;j++){
                if(X%j==0){
                    sum+=j;
                }
            }
            if(sum==X){
                 System.out.println(X + " eh perfeito");
            }
            else{
              System.out.println(X + " nao eh perfeito");  
            }
        }
        
    }
    
}
