
import java.util.Scanner;


public class salarywithbonus {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        String employeeName=input.nextLine();
        double fixedSalary=input.nextDouble();
        double saleTotal=input.nextDouble();
        double total=fixedSalary+(saleTotal*15/100);
        System.out.printf("TOTAL = R$ %.2f",total);
        
    }
    
}
