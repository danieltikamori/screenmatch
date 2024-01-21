import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {
        Scanner userInputReader = new Scanner(System.in);
        System.out.println("Type your favorite movie: ");
        String favoriteMovie = userInputReader.nextLine();

    }
}
