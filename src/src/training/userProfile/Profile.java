package userProfile;


public class Profile {
    private  int numberOfFriends;
    private char genre;
    private double averageSalaryLastYear;
    private String positionInsideCompany;
    private boolean hadPreviousJob;
    private String agreeToTravelAbroad;
    private String bestMeal;

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public double getAveregeSalaryLastYear() {
        return averageSalaryLastYear;
    }

    public void setAveregeSalaryLastYear(double averegeSalaryLastYear) {
        this.averageSalaryLastYear = averegeSalaryLastYear;
    }

    public String getPositionInsideCompany() {
        return positionInsideCompany;
    }

    public void setPositionInsideCompany(String positionInsideCompany) {
        this.positionInsideCompany = positionInsideCompany;
    }

    public boolean isHadPreviousJob() {
        return hadPreviousJob;
    }

    public void setHadPreviousJob(boolean hadPreviousJob) {
        this.hadPreviousJob = hadPreviousJob;
    }

    public String getAgreeToTravelAbroad() {
        return agreeToTravelAbroad;
    }

    public void setAgreeToTravelAbroad(String agreeToTravelAbroad) {
        this.agreeToTravelAbroad = agreeToTravelAbroad;
    }

    public String getBestMeal() {
        return bestMeal;
    }

    public void setBestMeal(String bestMeal) {
        this.bestMeal = bestMeal;
    }

    public Profile() {
        numberOfFriends = 10;
    }

    public Profile(Profile secondProfile) {
        this.numberOfFriends = secondProfile.numberOfFriends;
        this.genre = secondProfile.genre;
        this.averageSalaryLastYear = secondProfile.averageSalaryLastYear;
    }

    public Profile(int numberOfFriends, char genre, double averegeSalaryLastYear, String positionInsideCompany, boolean hadPreviousJob, String agreeToTravelAbroad, String bestMeal) {
        this.numberOfFriends = numberOfFriends;
        this.genre = genre;
        this.averageSalaryLastYear = averegeSalaryLastYear;
        this.positionInsideCompany = positionInsideCompany;
        this.hadPreviousJob = hadPreviousJob;
        this.agreeToTravelAbroad = agreeToTravelAbroad;
        this.bestMeal = bestMeal;
    }



    }

