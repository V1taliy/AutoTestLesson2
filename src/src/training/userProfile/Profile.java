package userProfile;


public class Profile {
    private  int numberOfFriends;
    private char genre;
    private double averegeSalaryLastYear;
    private String positionInsideCompany;
    private boolean hadPreviousJog;
    private String agreeToTravelAbroad;
    private String bestMeal;

    public Profile(int numberOfFriends, char genre, double averegeSalaryLastYear, String positionInsideCompany, boolean hadPreviousJog, String agreeToTravelAbroad, String bestMeal) {
        this.numberOfFriends = numberOfFriends;
        this.genre = genre;
        this.averegeSalaryLastYear = averegeSalaryLastYear;
        this.positionInsideCompany = positionInsideCompany;
        this.hadPreviousJog = hadPreviousJog;
        this.agreeToTravelAbroad = agreeToTravelAbroad;
        this.bestMeal = bestMeal;
    }

    public Profile() {

    }
}
