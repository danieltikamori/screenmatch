package cc.tkmr.screenmatch.models;

import cc.tkmr.screenmatch.calculations.Classifiable;

public class Episode implements Classifiable {
    private int episodeNumber;
    private String episodeName;
    private Series series;
    private int episodeDurationInMinutes;
    private double episodeGrade;
    private int totalVisualizations;

    public int getTotalVisualizations() {
        return totalVisualizations;
    }

    public void setTotalVisualizations(int totalVisualizations) {
        this.totalVisualizations = totalVisualizations;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public int getEpisodeDurationInMinutes() {
        return episodeDurationInMinutes;
    }

    public void setEpisodeDurationInMinutes(int episodeDurationInMinutes) {
        this.episodeDurationInMinutes = episodeDurationInMinutes;
    }

    public double getEpisodeGrade() {
        return episodeGrade;
    }

    public void setEpisodeGrade(double episodeGrade) {
        this.episodeGrade = episodeGrade;
    }

    @Override
    public int getClassification() {
        if (totalVisualizations > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
