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
public class sumofevennumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        for(int i=1;i<=N;i++){
            int X=input.nextInt();
            int Y=input.nextInt();
          
            int sum=0;
            int count=0;
            while(count<Y){
                if(X%2!=0){
                    sum+=X;
                    count++;
                }
                X++;
            }
            System.out.println(sum);
           
        }
        
    }
    
}
