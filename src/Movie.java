public class Movie {
    private String movieTitle;
    private int launchDate;
    private boolean includedInPlan;
    private double movieGrade;
    private double movieGradeSum;
    private int totalGradeCount;
    private double averageMovieGrade;
    private int totalReviewCount;
    private double averageReview;
    private int movieDuration;
    private String movieGenre;
    private String movieDirector;

    int getTotalGradeCount() {
        return totalGradeCount;
    }

    void showMovieDetails() {
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Included in plan: " + includedInPlan);
        System.out.println("Movie Grade: " + movieGrade);
        System.out.println("Total Review Count: " + totalGradeCount);
        System.out.println("Average Movie Grade: " + averageMovieGrade);
        System.out.println("Total Rating Count: " + totalReviewCount);
        System.out.println("Average Rating: " + averageReview);
        System.out.println("Movie Duration: " + movieDuration);
        System.out.println("Movie Genre: " + movieGenre);
        System.out.println("Movie Director: " + movieDirector);
    }

    void calculateMovieGrade(double grade) {
        movieGradeSum += grade;
        totalGradeCount++;
    }

    double calculateAverageMovieGrade() {
        return movieGradeSum / totalGradeCount;
    }
}

