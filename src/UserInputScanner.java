import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Type your favorite movie: ");
        String favoriteMovie = userInputScanner.nextLine();
        System.out.println("What's the launch year: ");
        int launchYear = userInputScanner.nextInt();
        System.out.println("Tell your movie grade: ");
        double movieGrade = userInputScanner.nextDouble();

        System.out.println(favoriteMovie);
        System.out.println(launchYear);
        System.out.println(movieGrade);
    }
}
