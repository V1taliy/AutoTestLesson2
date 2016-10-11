package userData;

import userProfile.Profile;

public class User extends Profile {
    private String username;
    private int password;

    public User() {
        username = "TestUsername";
        password = 0;
        setNumberOfFriends( 0 );
        setGenre( 'm' );
        setAgreeToTravelAbroad( null );
        setAveregeSalaryLastYear( 0 );
        setBestMeal( "Pizza" );
        setHadPreviousJob( true );
        setPositionInsideCompany( "HR" );
    }
    public User(double averegeSalary){
        averegeSalary = averegeSalary;
    }

    public User(String username) {
        this.username = username;
    }

    public User(String username, int password) {
        this.password = password;
    }

    public User(User secondUser) {
        this.username = secondUser.username;
        this.password = secondUser.password;
    }

    public User(String username, int password, int numberOfFriends, char genre , double averageSalaryLastYear, String positionInsideCompany, boolean hadPreviousJob , String agreeToTravelAbroad, String bestMeal  ) {
        this.username = username;
        this.password = password;
        setNumberOfFriends( numberOfFriends );
        setGenre( genre );
        setAveregeSalaryLastYear( averageSalaryLastYear );
        setPositionInsideCompany(positionInsideCompany );
        setHadPreviousJob( hadPreviousJob );
        setAgreeToTravelAbroad( agreeToTravelAbroad );
        setBestMeal( bestMeal );


    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;

    }

    @Override
    public String toString() {
        return "User{" +
                "username = '" + username + '\'' +
                ", password = " + password + ", number of friends = " + getNumberOfFriends()  + ", genre = " +getGenre()+ ", average salary = " + getAveregeSalaryLastYear()
                 + ", position = " + getPositionInsideCompany()  + ", had previous job = " + isHadPreviousJob(true)  + ", agree to travel = " + getAgreeToTravelAbroad()  + ", best meal = " + getBestMeal() +
                '}';
    }


    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        User user1 = new User( "User1", 123 );
        User user2 = new User( "User2", 111 );

        System.out.println( user2.toString() );

        user2 = new User( user1 );

        System.out.println( user2.toString() );

    }
}