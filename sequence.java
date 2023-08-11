
public class sequence {
     public static void main(String[] args){
     double i = 0;
        double j = 1;
        while (i <= 2) {
            for (int k = 0; k < 3; k++) {
                System.out.printf("I=%.1f J=%.1f\n", i, j);
                j++;
            }
            i += 0.2;
            j -= 3;
            j += 0.2;
        }
    }
}
