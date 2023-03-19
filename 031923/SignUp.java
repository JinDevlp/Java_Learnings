import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.5 to access the link).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        int counter = 0;

        System.out.println("What is your first name?");
        String firstname = scanner.nextLine();
        counter ++;

        System.out.println("What is your last name?");
        String lastname = scanner.nextLine();
        counter ++;

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        counter ++;

        scanner.nextLine(); // throwaway nextline to be wasted on empty space.
        System.out.println("Make a username");
        String username = scanner.nextLine();
        counter ++;

        // If you experience trouble picking up the username, please carefully read the instructions on Learn the Part.

        System.out.println("What city do you live in?");
        String city = scanner.nextLine();
        counter ++;

        System.out.println("What country is that?");
        String country = scanner.nextLine();
        counter ++;

        System.out.println("Thank you for joining JavaGram!");

        System.out.println("\nHere is the information you entered:");

        System.out.println("\tFirst Name: "+ firstname);
        System.out.println("\tLast Name: " + lastname);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        scanner.close();
        //close scanner. It's good practice :D !
    }
}
