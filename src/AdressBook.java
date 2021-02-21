import java.util.*;

public class AdressBook {

    public static void main(String[] args) {
        HashMap<String, String> person=new HashMap<String, String>();
        Scanner myObj = new Scanner(System.in);
       System.out.println("Enter 1 to add contact information");
        System.out.println("Enter 2 to view contact information");
       String input = myObj.nextLine();

        do{

            System.out.println("Please add new contact information ");
            System.out.println("What is the name");
            String name = myObj.nextLine();
            String stName=name;
            System.out.println("What is the email");
            String email = myObj.nextLine();
            String stemail=email;
            System.out.println("Enter 1 to add contact information");
            System.out.println("Enter 2 to view contact information");
            input = myObj.nextLine();
        }while(!input.equals("2"));
        person person1=new person("George", "George@memes.Com");
        person person2=new person("Lilly", "Lilly@cooking.com");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
