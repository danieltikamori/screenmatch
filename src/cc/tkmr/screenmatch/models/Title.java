package cc.tkmr.screenmatch.models;

public class Title {
    private String titleName;
    private int launchDate;
    private boolean includedInPlan;
    private double titleRating;
    private double titleRatingSum;
    private int totalGradeCount;
    private double averageTitleRating;
    private int totalReviewCount;
    private double averageReview;
    private int titleDurationInMinutes;
    private String titleGenre;
    private String titleDirector;

    public Title(String titleName, int launchDate) {
        this.titleName = titleName;
        this.launchDate = launchDate;
    }

    public String getTitleName() {
        return titleName;
    }

    public int getLaunchDate() {
        return launchDate;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getTitleDurationInMinutes() {
        return titleDurationInMinutes;
    }

    public double takeAverageTitleRating() {
        return averageTitleRating;
    }

    public double getAverageReview() {
        return averageReview;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public void setLaunchDate(int launchDate) {
        this.launchDate = launchDate;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setTitleDurationInMinutes(int titleDurationInMinutes) {
        this.titleDurationInMinutes = titleDurationInMinutes;
    }

    public void showTitleDetails() {
        System.out.println("Title Name: " + titleName);
        System.out.println("Launch Date: " + launchDate);
    }

    public void evaluateTitle(double titleGrade) {
        titleRatingSum += titleGrade;
        totalGradeCount++;
    }

    public double calculateAverageTitleRating() {
        return titleRatingSum / totalGradeCount;
    }

}
