
import java.util.Scanner;


public class Evennumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int startTime=input.nextInt();
        int endTime=input.nextInt();
        int duration;
        if(startTime<endTime){
              duration=endTime-startTime;
             
        }
        else{
            duration=24-startTime+endTime;
        }
        System.out.println(" “O JOGO DUROU "+duration+ " HORA(S)");
    }
}
        