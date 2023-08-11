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
public class time {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter distance ,mintues , second : ");
        double distance = s.nextDouble();
        int min = s.nextInt();
        int sec = s.nextInt();
        sec=min*60+sec;
        double kps = distance/sec;
        double kph= kps*3600;
        double mph = kph/1.6;
        System.out.println("Average speed in miles per hour : "+mph);
        
        
        
    }
    
}
