import java.util.Scanner;

class Book{
    private int ISBN;
    private String bookTitle;
    private int numberofPages;
    private int count;

public Book(int ISBN,String bookTitle,int numberofPages ){
    this.ISBN=ISBN;
    this.bookTitle=bookTitle;
    this.numberofPages=numberofPages;
    this.count=1;
}
public Book(){
    this.ISBN=0;
    this.bookTitle=" ";
    this.numberofPages=0;
    this.count=0;
}

public String toString(){
    return "ISBN"+ISBN+"bookTitle"+bookTitle+"numberofPages"+numberofPages+"count"+count;
}
public int compareTo(Book other){
    if(this.numberofPages>other.numberofPages)
        return 1;
   
    else if(this.numberofPages==other.numberofPages)
        return 0;
    else
        return -1;
   
}
public int getCount(){
    return count;
   
}
public int getNumberofPages(){
    return numberofPages;
}

   
   
}
        public class Main {
    public static void main(String[] args){
        Book[] books=new Book[5];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("enter the details about books: "+(i+1));
            System.out.println("ISBN: ");
            int isbn=input.nextInt();
            input.nextLine();
            System.out.println("Title: ");
            String Title=input.nextLine();
            System.out.println("numberofPages: ");
            int numberofPages=input.nextInt();
           
            books[i] =new Book(isbn ,Title,numberofPages);
           
        }
        displayAll(books);
         System.out.println("Comparing Book 1 and Book 2 based on pages: " + books[0].compareTo(books[1]));

        System.out.println("Is Book 3 heavier than 500 pages? " +isHaevier(books[2]));
   
       
    }

       
   
        public static void displayAll(Book[] books) {
        System.out.println("all books");
        for(int i=0;i<5;i++){
            System.out.println(books[i].toString());
        }
        }
        public static boolean isHaevier(Book book){
            if(book.getNumberofPages()>500){
                return true;
               
            }
            else
                return false;
        }
        }

