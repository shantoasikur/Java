
import java.util.Scanner;


public class selectionTest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double A=input.nextDouble();
        if(A<0 || A>100){
            System.out.println("Fora de intervalo");
            
        }
        
        else if(A<=25){
            System.out.println("Intervalo [0,25]");
        }
        else if(A<=50){
            System.out.println("Intervalo (25,50]");
        }
        else if(A<=75){
            System.out.println("Intervalo (50,75]");
        }
        else{
             System.out.println("Intervalo (75,100]");
        }
        
        
        
    }
}
       