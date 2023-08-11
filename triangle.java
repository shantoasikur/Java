
import java.util.Arrays;
import java.util.Scanner;


public class triangle {
     public static void main(String[] args){
        Scanner input=new Scanner (System.in);
       double[] sides = new double[3];
    for (int i = 0; i < 3; i++) {
        sides[i] = input.nextDouble();
    }
    Arrays.sort(sides);
    double A=sides[2];
    double B=sides[1];
    double C=sides[0];
     
        if( A >= B + C){
            System.out.printf("NAO FORMA TRIANGULO\n");
        }
        
        else{
            if (A*A==B*B+C*C){
            System.out.printf(" TRIANGULO RETANGULO\n");
          
        }
         if(A*A>B*B+C*C){
            System.out.printf("TRIANGULO OBTUSANGULO\n");
        }
         if(A*A<B*B+C*C){
            System.out.println("TRIANGULO ACUTANGULO\n");
        }
         if(A==B && B==C && A==C){
            System.out.println("TRIANGULO EQUILATERO\n");
            
        }
         if((A==B || A==C || B==C) &&(A!=B || A!=C || B!=C)){
            System.out.printf("TRIANGULO ISOSCELES\n");
        }
        
}
}
}
