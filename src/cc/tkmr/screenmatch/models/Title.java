package cc.tkmr.screenmatch.models;

public class Title {
    private String titleName;
    private int launchDate;
    private boolean includedInPlan;
    private double titleGrade;
    private double titleGradeSum;
    private int totalGradeCount;
    private double averageTitleGrade;
    private int totalReviewCount;
    private double averageReview;
    private int titleDurationInMinutes;
    private String titleGenre;
    private String titleDirector;

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

    public double getAverageTitleGrade() {
        return averageTitleGrade;
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

    public void calculateTitleGrade(double titleGrade) {
        titleGradeSum += titleGrade;
        totalGradeCount++;
    }

    public double calculateAverageTitleGrade() {
        averageTitleGrade = titleGradeSum / totalGradeCount;
        return averageTitleGrade;
    }
}
