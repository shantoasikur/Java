
import java.util.Scanner;


public class multiples {
     public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        int A=input.nextInt();
          int B=input.nextInt();
          if (A%B==0 || B%A==0){
              System.out.printf("Sao Multiplos\n");
          }
          else{
              System.out.printf("Nao sao Multiplos\n");
          }
        
}
}
