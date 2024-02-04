package cc.tkmr.screenmatch.models;

public class Series extends Title {

    private int numberOfSeasonsInSeries;
    private int numberOfEpisodesInSeason;
    private boolean isSeriesActive;
    private int minutesPerEpisode;

    public Series(String titleName, int launchDate) {
        super(titleName, launchDate);
    }

    public Series(String titleName, int launchDate, boolean includedInPlan) {
        super(titleName, launchDate);
        setIncludedInPlan(includedInPlan);
    }

    public int getNumberOfSeasonsInSeries() {
        return numberOfSeasonsInSeries;
    }

    public void setNumberOfSeasonsInSeries(int numberOfSeasonsInSeries) {
        this.numberOfSeasonsInSeries = numberOfSeasonsInSeries;
    }

    public int getNumberOfEpisodesInSeason() {
        return numberOfEpisodesInSeason;
    }

    public void setNumberOfEpisodesInSeason(int numberOfEpisodesInSeason) {
        this.numberOfEpisodesInSeason = numberOfEpisodesInSeason;
    }

    public boolean isSeriesActive() {
        return isSeriesActive;
    }

    public void setSeriesActive(boolean seriesActive) {
        isSeriesActive = seriesActive;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getTitleDurationInMinutes() {
        return numberOfSeasonsInSeries * numberOfEpisodesInSeason * minutesPerEpisode;
    }
}
