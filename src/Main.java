import Calculations.DurationCalculator;
import cc.tkmr.screenmatch.models.Movie;
import cc.tkmr.screenmatch.models.Series;
import cc.tkmr.screenmatch.models.Title;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitleName("Star Wars");
        myMovie.setLaunchDate(1977);
        myMovie.setIncludedInPlan(true);
        myMovie.setTitleDurationInMinutes(200);
//        myMovie.movieGenre = "Sci-Fi";

        Movie myMovie2 = new Movie();
        myMovie2.setTitleName("Lord of the Rings");
        myMovie2.setLaunchDate(2001);
        myMovie2.setIncludedInPlan(false);
        myMovie2.setTitleDurationInMinutes(300);

        Series mySeries = new Series();
        mySeries.setTitleName("Game of Thrones");
        mySeries.setLaunchDate(2011);
        mySeries.setNumberOfSeasonsInSeries(8);
        mySeries.setNumberOfEpisodesInSeason(8);
        mySeries.setMinutesPerEpisode(30);
        mySeries.setIncludedInPlan(true);


        myMovie.showTitleDetails();
        myMovie.calculateTitleGrade(9.5);
        myMovie.calculateTitleGrade(8.5);
        myMovie.calculateTitleGrade(7.5);
//        System.out.println(myMovie.movieGradeSum);
//        System.out.println(myMovie.totalGradeCount);
        System.out.println(myMovie.calculateAverageTitleGrade());

        // Testing code on Polymorphism
        DurationCalculator durationCalculator = new DurationCalculator();
        durationCalculator.includeTitle(myMovie);
        durationCalculator.includeTitle(myMovie2);
        durationCalculator.includeTitle(mySeries);
        System.out.println(durationCalculator.getTotalDurationInMinutes());
    }
}