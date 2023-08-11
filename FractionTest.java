class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    public String toString(){
        return numerator+ " "+denominator;
        
    }
  public void add(Fraction fraction){
        int num1=this.numerator*fraction.getDenominator();
        int num2=fraction.getNumerator()*this.denominator;
        int sum=num1+num2;
        int commondenominator=fraction.getDenominator()*this.denominator;
        this.numerator=sum;
        this.denominator=commondenominator;
        
    }
    public void division(Fraction fraction){
        int newNumerator= this.numerator * fraction.getDenominator();
        int newDenominator=this. denominator * fraction.getNumerator();
        
        numerator=newNumerator;
        denominator=newDenominator;
        
    }
   
}
public class FractionTest {
    public static void main(String[] args){
        Fraction fraction1=new Fraction(1,4);
        Fraction fraction2=new Fraction(3,5);
        System.out.println("Fraction1: "+fraction1.toString());
        System.out.println("Fraction2: "+fraction2.toString());
        fraction1.add(fraction2);
        System.out.println("Addition: "+fraction1.toString());
        fraction1.division(fraction2);
        System.out.println("fraction1/fraction2= "+fraction1.toString());
        fraction1.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
        fraction1.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        System.out.println("f1 * f2 = " + fraction1);
       
        
    }
    
}
