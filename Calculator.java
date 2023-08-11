import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;
    
    public Calculator() {
        num1 = 0;
        num2 = 0;
    }
    
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    
    public double getNum1() {
        return num1;
    }
    
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double getNum2() {
        return num2;
    }
    
    public double add() throws ArithmeticException {
        double sum = num1 + num2;
        if(sum < 0) {
            throw new ArithmeticException("The sum of the two numbers is negative.");
        }
        return sum;
    }
    
    public double subtract() throws ArithmeticException {
        double difference = num1 - num2;
        if(difference < 0) {
            throw new ArithmeticException("The difference of the two numbers is negative.");
        }
        return difference;
    }
    
    public double multiply() throws ArithmeticException {
        if(num1 == 0 || num2 == 0) {
            throw new ArithmeticException("One of the numbers is zero.");
        }
        return num1 * num2;
    }
    
    public double divide() throws ArithmeticException {
        if(num2 == 0) {
            throw new ArithmeticException("The second number is zero.");
        }
        return num1 / num2;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true) {
            try {
                System.out.print("Enter the first number: ");
                double num1 = Double.parseDouble(input.nextLine());
                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(input.nextLine());
                
                Calculator calc = new Calculator(num1, num2);
                
                System.out.println("The sum of the two numbers is " + calc.add());
                System.out.println("The difference of the two numbers is " + calc.subtract());
                System.out.println("The product of the two numbers is " + calc.multiply());
                System.out.println("The quotient of the two numbers is " + calc.divide());
            } catch(NumberFormatException e) {
                System.out.println("Invalid input. Please enter only numeric values.");
                break;
            } catch(ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
