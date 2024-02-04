package cc.tkmr.screenmatch.calculations;

public class RecommendationFilter {
    public void filter(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("It is among the preferred at the moment");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Well evaluated at the moment");
        } else {
            System.out.println("Put in your watchlist to watch later");
        }

    }
}
