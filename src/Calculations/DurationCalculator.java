package Calculations;

import cc.tkmr.screenmatch.models.Title;

public class DurationCalculator {

    private int totalDurationInMinutes = 0;
    public int getTotalDurationInMinutes() {
        return this.totalDurationInMinutes;
    }
    public void includeTitle(Title title) {
        System.out.println("Adding duration in minutes of " + title); // Testing Polymorphism. Shows package.class@hashcode(?)
        this.totalDurationInMinutes += title.getTitleDurationInMinutes();
    }
}
