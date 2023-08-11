/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BMI {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        double weight=input.nextDouble();
        double height=input.nextDouble();
         double BMI=weight/(height*height);
         if(BMI<18.5){
             System.out.printf("underweight");
             
         }
         else if(BMI>=18.5 && BMI<25){
             System.out.printf("normal");
         }
         else if(BMI>=25 && BMI<30){
             System.out.printf("overweight");
         }
         else if(BMI>30){
             System.out.printf("obese");
         }
        
        
    }
    
}
