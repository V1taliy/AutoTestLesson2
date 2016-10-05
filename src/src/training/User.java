/**
 * Created by VitaliyS on 10/05/2016.
 */
public class User {
    private String username;
    private int password;

    public User(User secondUser) {
        this.username = secondUser.username;
        this.password = secondUser.password;
    }

    public User(String username, int password) {
        User secondUser = new User("TestUsername", 123456);
        this.username = username;
        this.password = password;


    }

    public User() {
        User myUser = new User();
        myUser.username = "TestUsername";

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
}