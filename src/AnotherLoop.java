import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program prompts the user to enter movie grades, until the user enters a -1.
 * The program then calculates the average of all the grades entered.
 */
public class AnotherLoop {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        double movieGradeSum = 0.0;
        int movieGradeCounter = 0;

        while (true) {
            //Handles input errors. I.E. the user enters a string instead of a number.
            try {
                System.out.println("Tell your movie grade or type -1 to exit: ");
                double movieGrade = userInputScanner.nextDouble();
                if (movieGrade == -1.0) {
                    break;
                } else if (!Double.isNaN(movieGrade) && movieGrade >= 0.0 && movieGrade <= 10.0) {
                    movieGradeSum += movieGrade;
                    movieGradeCounter++;
                } else {
                    System.out.println("Invalid grade entered.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                userInputScanner.next();
            }
        }
        if (movieGradeCounter == 0) {
            System.out.println("No grades entered.");
        } else {
            System.out.println("The average grade is: " + movieGradeSum / movieGradeCounter);
        }
    }
}