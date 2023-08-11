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
public class Factorial {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int fact=1;
        for(int i=N;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
        
    }
    
}
