package GradeManager;
import java.util.Scanner;

    public class LibrarySystem {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("LIBRARY SYSTEM");
        
        String[] books = { "English for Academic and Professional Purposes","Oral Communication",
        "Practical Research 1","Practical Research 2","General Mathematics","Statistics and Probability",
        "Earth and Life Science","Physical Science","Reading and Writing Skills","21st Century Literature",
        "Empowerment Technologies","Personal Development","Introduction to Philosophy","Physical Education",
        "Understanding Culture, Society and Politics"};

        boolean[] available = {true,false,true,false,true,false,true,false,true,false,true,false,true,false,true};

        String[] borrower = {"","Aina Banate","","Kurt Bayato","","Axel Munar","","Jake Villadolid","",
                             "Princess Balais","","Peter Parker","","Peter Pan",""};

        String[] dateBorrowed = {"","May 3, 2026","","May 4,2026","","May 6,2024","","May 5,2026",""
                               ,"May 7, 2026","","May 8,2026","","May 5 2026",""};

        for(int i = 0; i < books.length; i++)
        {
            System.out.println((i + 1) + "." + books[i]);
        }

        System.out.print("Choose Book: ");
        int choice = input.nextInt() - 1;

        if(choice >= 0 && choice < books.length)
        {
            if(available[choice])
            {
                System.out.println("Book: " + books[choice]);
                System.out.println("Status: AVAILABLE");
            }
            else
            {
                System.out.println("Book: " + books[choice]);
                System.out.println("Status: NOT AVAILABLE");
                System.out.println("Last Borrower: " + borrower[choice]);
                System.out.println("Date Borrowed: " + dateBorrowed[choice]);
            }
        }
        else
        {
            System.out.println("Invalid Choice.");
        }

    }
}