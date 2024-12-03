package src.days;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //This is to make sure that the days will repeat endlessly
        boolean continueChecking = true;

        while (continueChecking) {
            System.out.println("Enter a number between 1 and 7 to get its specific day: ");
            try{
                int day = Integer.parseInt(scanner.nextLine());

                switch (day) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        // Default handles any numbers entered not within the set space.
                        System.out.println("Invalid number. Please enter a number between 1 and 7.");
                        break;
                }
                // to stop non number characters inputted.
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid integer.");
                continue;
            }

            System.out.println("Do you wish to check another number? (Yes/No)");
            String response = scanner.nextLine();
            //This allows the user to end program. You could type whatever, as long as response is not "Yes" it will end the program
            if (!response.equals("Yes")) {

                //Setting boolean to false back at line 10
                continueChecking = false;
            }
        }
        // Generic text just to show user choice is negative1
        System.out.println("End.");
        scanner.close();
    }
}
