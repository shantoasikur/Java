
import java.util.Scanner;


public class cubic {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double i=0;
        double j=1;
       while(i<=2) 
       if((i>0 && i<1)|| (i>1 && i<2)){
            System.out.printf("I=%0.1f J=%0.1f\n",i,j+i);
            System.out.printf("I=%0.1f J=%0.1f\n",i,j+1+i);
            System.out.printf("I=%0.1f J=%0.1f\n",i,j+2+i);
        }
        else{
            System.out.printf("I=%d J=%d\n",i,j+i);
            System.out.printf("I=%d J=%d\n",i,j+i+1);
            System.out.printf("I=%d J=%d\n",i,j+i+2);
      
              
           }
       i+=0.2;
       }
}

