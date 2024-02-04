package cc.tkmr.screenmatch.models;

import cc.tkmr.screenmatch.calculations.Classifiable;

public class Movie extends Title implements Classifiable {

    // Constructor - initialize object titleName and launchDate
    public Movie(String titleName, int launchDate) {
        super(titleName, launchDate);
    }

    @Override
    public int getClassification() {
        return (int) takeAverageTitleRating() / 2;
    }

    @Override //Overriding the toString method!
    public String toString() {
        return "Movie: " + this.getTitleName() + " (" + this.getLaunchDate() + ")";
    }
}

