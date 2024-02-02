import java.time.Year;

public class Conditional {
    public static void main(String[] args) {
        int launchYear = 2022;
        boolean includedInPlan = false;
        double movieGrade = 9.3;
        int currentYear = Year.now().getValue();
        String planType = "Plus";



        if (launchYear > currentYear) {
            System.out.println("cc.tkmr.screenmatch.models.Movie release that customers are liking!");
        } else {
            System.out.println("Retro movie that worth watching!");
        }
        if(includedInPlan || planType.equals("Plus")) {
            System.out.println("Included in plan!");
        } else {
            System.out.println("Not included in plan!");
        }
    }
}
