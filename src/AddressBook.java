import java.util.*;
public class AddressBook {

        private static  HashMap<String, String> addressbook=new HashMap<String, String>();

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int menu;
            System.out.println("Please Choose an option: ");
            System.out.println("(0) Exit.");
            System.out.println("(1) Add Contact");
            System.out.println("(2) Look up Contact.");
            System.out.println("(3) Display all contacts");
            menu=sc.nextInt();
            while(menu!=0){
                switch (menu){
                    case 0:
                        System.exit(0);
                    case 1:
                        while (menu != 2) {
                            System.out.println("Enter Your name");
                            String fullName=sc.next();
                            System.out.println("Enter Your email");
                            String email=sc.next();
                            Person person=new Person(fullName,email);
                            person.setName(fullName);
                            person.setEmail(fullName);
                            System.out.println("you just entered"+person.toString());
                            addressbook.put(fullName,email);
                            System.out.println("would you like to add someone else? 1: yes, 2: No");
                            menu=sc.nextInt();

                        }
                        break;
                    case 2:
                        System.out.println("Enetr the person you would like to look up:");
                        String fullNameKey=sc.next();
                        System.out.println("email: "+addressbook.get(fullNameKey));
                        break;
                    case 3:
                        System.out.println(addressbook);
                        break;

                }
            }
        }





    }

