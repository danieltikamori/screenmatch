package cc.tkmr.screenmatch.main;

import cc.tkmr.screenmatch.models.Movie;
import cc.tkmr.screenmatch.models.Series;
import cc.tkmr.screenmatch.models.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Star Wars", 1977);
        myMovie.evaluateTitle(9.5);
        myMovie.evaluateTitle(8.5);
        Movie myMovie2 = new Movie("Lord of the Rings", 2000);
        myMovie2.evaluateTitle(8.9);
        myMovie2.evaluateTitle(7.9);
        Series mySeries = new Series("Game of Thrones", 2011);

        var danielsMovie = new Movie("The Matrix", 1999); // Use var instead of Movie
        danielsMovie.evaluateTitle(8.7);
        danielsMovie.evaluateTitle(9.1);

        ArrayList<Title> titleArrayList = new ArrayList<>(); // or var instead of ArrayList
        titleArrayList.add(danielsMovie);
        titleArrayList.add(myMovie);
        titleArrayList.add(myMovie2);
        titleArrayList.add(mySeries);

        for (Title title : titleArrayList) {
            System.out.println(title.getTitleName());
            // Avoid instanceof if possible. It is not a good practice nowadays. You may see at legacy code.
            if (title instanceof Movie movie && movie.calculateAverageTitleRating() > 2) {
                System.out.println("Rating: " + movie.calculateAverageTitleRating());
            }
        }
//            Movie movie = (Movie) title;
//            System.out.println("Rating: " + movie.getAverageReview());
    }

}