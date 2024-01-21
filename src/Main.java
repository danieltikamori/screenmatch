//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("This is Screen Match!");
        System.out.println("Movie: Top Gun: Maverick");

        int launchYear = 2022;
        System.out.println("Launch year: " + launchYear);
        boolean includedInPlan = true;
        double movieGrade = 9.0;
        // Average calculated using 3 grades.
        double averageGrade = (9.80 + 6.3 + 8) / 3.0;
        System.out.println(averageGrade);
        String synopsis;
        synopsis = """
                    Top Gun
                    Adventure movie with famous actors. 2022
                    Very good
                    Launch year:\s""" + launchYear;
        System.out.println(synopsis);

        int movieClassification = (int) (averageGrade / 2);
        System.out.println(movieClassification);
    }
}