package cc.tkmr.screenmatch.models;

import cc.tkmr.screenmatch.calculations.Classifiable;

public class Movie extends Title implements Classifiable {

    @Override
    public int getClassification() {
        return (int) getAverageTitleGrade() / 2;
    }
}

