public class Movie {
    String movieTitle;
    int launchDate;
    boolean includedInPlan;
    double movieGrade;
    double movieGradeSum;
    int totalGradeCount;
    double averageMovieGrade;
    int totalReviewCount;
    double averageReview;
    int movieDuration;
    String movieGenre;
    String movieDirector;

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

