
import java.util.Scanner;


public class Growingsequences {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
       int count=1;
       while(count<=y){
       for(int i=0;i<x && count<=y;i++){
           
           System.out.print(count + " ");
           count++;
       }
           System.out.println();
    }
       sc.close();
}
}

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int count = 1;
        while (count <= y) {
            for (int i = 0; i < x && count <= y; i++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}*/
        