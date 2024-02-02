package cc.tkmr.screenmatch.models;

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

    public int getTotalGradeCount() {
        return totalGradeCount;
    }

    public void showMovieDetails() {
        System.out.println("cc.tkmr.screenmatch.models.Movie Title: " + movieTitle);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Included in plan: " + includedInPlan);
        System.out.println("cc.tkmr.screenmatch.models.Movie Grade: " + movieGrade);
        System.out.println("Total Review Count: " + totalGradeCount);
        System.out.println("Average cc.tkmr.screenmatch.models.Movie Grade: " + averageMovieGrade);
        System.out.println("Total Rating Count: " + totalReviewCount);
        System.out.println("Average Rating: " + averageReview);
        System.out.println("cc.tkmr.screenmatch.models.Movie Duration: " + movieDuration);
        System.out.println("cc.tkmr.screenmatch.models.Movie Genre: " + movieGenre);
        System.out.println("cc.tkmr.screenmatch.models.Movie Director: " + movieDirector);
    }

    public void calculateMovieGrade(double grade) {
        movieGradeSum += grade;
        totalGradeCount++;
    }

    public double calculateAverageMovieGrade() {
        return movieGradeSum / totalGradeCount;
    }
}

