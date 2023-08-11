/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String [] args){
        Scanner input=new Scanner (System.in);
        int n=input.nextInt();
        int[]fib=new int [n];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
            
        }
        for(int i=0;i<n;i++){
            System.out.print(" "+ fib[i]);
        }
       
    }
    
}
