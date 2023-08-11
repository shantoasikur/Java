
import java.util.Scanner;
class Icecream{
    private String name;
    private String company;
    private int price;
    
    public Icecream(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
    
public class iceream {
     public static void main(String[] args){
        Icecream[]icecreams=new Icecream[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("enter details about icecream" +(i+1)+":");
            System.out.print("Icecream name: ");
            String name=input.nextLine();
            System.out.print("Icecream company: ");
            String company=input.nextLine();
            System.out.print("Icecream price: ");
            int price=input.nextInt();
            input.nextLine();
            icecreams[i] =new Icecream(name,company,price);
        }
            
        
        System.out.print("enter the company name to search: ");
            String searchCompany=input.nextLine();
          searchByCompany(icecreams, searchCompany);
        }
    
        public static void searchByCompany( Icecream[]icecreams,String company){
            System.out.println("Ice creams manufactured by "+company+":");
          for (Icecream icecream : icecreams) {
      if (icecream.getCompany().equals(company)) {
        System.out.println(icecream.getName() + " - " + icecream.getPrice());
    
        }
}
        }
}



