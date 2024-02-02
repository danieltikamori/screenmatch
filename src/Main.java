import cc.tkmr.screenmatch.models.Movie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setMovieTitle("Star Wars");
        myMovie.setLaunchDate(1977);
        myMovie.setIncludedInPlan(true);
        myMovie.setMovieDurationInMinutes(200);
//        myMovie.movieGenre = "Sci-Fi";

        myMovie.showMovieDetails();
        myMovie.calculateMovieGrade(9.5);
        myMovie.calculateMovieGrade(8.5);
        myMovie.calculateMovieGrade(7.5);
//        System.out.println(myMovie.movieGradeSum);
//        System.out.println(myMovie.totalGradeCount);
        System.out.println(myMovie.calculateAverageMovieGrade());

    }
}