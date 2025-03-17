import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // create a year variable
        int year;

        // create a boolean to check if user has entered a valid input
        boolean validInput = false;

        // create an instance for the user input
        Scanner sc = new Scanner(System.in);

        while (!validInput) {
            // ask user for year
            System.out.println("Please give us a year and we will tell you if it is a leap year: ");

            // check if user enter an int
            if (sc.hasNextInt()) {
                // use the instance to store the user input as the year using the year variable
                year = sc.nextInt();

                // set bool to true so the loop ends.
                validInput = true;
                
                // check the year if it is a leap year
                // tell user if it is or isnt a leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("The year " + year + " is a leap year.");
                } else {
                    System.out.println("The year " + year + " is not a leap year.");
                }
            }
        }
        



        
        
        // check the year if it is a leap year
        // tell user if it is or isnt a leap year
        if (year % 4 == 0) {
            // if the year is divisible by 4 then
            System.out.println("The year " + year + " is a leap year.");
        } else if (year % 400 == 0) {
            // if the year is divivible by 400 then
            System.out.println("The year " + year + " is a leap year.");
        } else if (year % 100 == 0) {
            // if the year is divivible by 100 then
            System.out.println("The year " + year + " is not a leap year.");
        }
        else {
            // 
            System.out.println("The year " + year + " is not a leap year.");
        }
        
        // tell user if it is nonsense
        
        sc.close();
    }
}


