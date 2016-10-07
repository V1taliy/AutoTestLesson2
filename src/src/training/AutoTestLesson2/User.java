package AutoTestLesson2;


public class User {
    private String username;
    private int password;

    public User() {
        username = "TestUsername";  // == this.username = ...
    }

    public User(User secondUser) {
        this.username = secondUser.username;
        this.password = secondUser.password;
    }

    public User(String username, int password) {
        this.username = username;
        this.password = password;
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
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        User user1 = new User("User1", 123);
        User user2 = new User("User2", 321);

        System.out.println(user2.toString());

        user2 = new User(user1);

        System.out.println(user2.toString());

    }
}