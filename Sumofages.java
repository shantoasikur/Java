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
public class Sumofages {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int age,sum=0,count=0;
        while(true){
            age=input.nextInt();
            if(age<0){
                break;
            }
            sum+=age;
            count++;
            
        }
        double average=(double)sum/count;
        System.out.printf("%.2f\n",average);
        
    }
    
}
