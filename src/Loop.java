import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        double movieGradeAverage = 0;
        double movieGrade = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Tell your movie grade: ");
            movieGrade = userInputScanner.nextDouble();
            movieGradeAverage += movieGrade;

        }
        System.out.println("The average grade is: " + movieGradeAverage / 3);
    }
}
