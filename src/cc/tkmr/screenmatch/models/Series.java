package cc.tkmr.screenmatch.models;

public class Series extends Title {

    private int numberOfSeasonsInSeries;
    private int numberOfEpisodesInSeason;
    private boolean isSeriesActive;
    private int minutesPerEpisode;

    public Series(TitleOmdb titleName, TitleOmdb launchDate) {
        super(titleName, launchDate);
    }

    public Series(TitleOmdb titleName, TitleOmdb launchDate, boolean includedInPlan) {
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

    @Override
    public String toString() {
        return "Series: " + this.getTitleName() + " (" + this.getLaunchDate() + ")";
    }
}
