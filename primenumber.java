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
public class primenumber {
     public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        int N=input.nextInt();
        for(int i=1;i<=N;i++){
            int X=input.nextInt();
            boolean isprime=true;
            if(X<=1){
                isprime=false;
            }
            else{
                for(int j=2;j<=Math.sqrt(X);j++){
                    if(X%j==0){
                        isprime=false;
                        break;
                    }
                }
            }
            if (isprime) {
                System.out.println(X+ " eh primo");
            } else {
                System.out.println(X + " nao eh primo");
            }
        }
}
}
