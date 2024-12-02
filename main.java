import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        // Scenario, you want to add one number with another number and see the total.
        System.out.println("Please input the 2 integers you wish to add together.");


        // this line enables the user to input an integer and stores it.
        firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(" + ");
        // this line enables the user to input an integer and stores it.
        secondNumber = Integer.parseInt(scanner.nextLine());

        // this line does simple math and outputs the total.
        System.out.println("The total for " + firstNumber + " + " + secondNumber + " is: " + (firstNumber + secondNumber));
// main

    }
}
