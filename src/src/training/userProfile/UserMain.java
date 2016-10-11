package userProfile;


import userData.User;

public class UserMain {

    public static void main(String[] args) {

        User user1 = new User("Gani.P", 2014, 53, 'M' , 142.64 , "Java developer", false , "TRUE" , "Sushi"   );
        System.out.println(user1.toString());
        User user2 = new User("Niru.X", 2015, 167, 'F' , 280 , "Byssines Analyst", true , "FALSE" , "Burger"  );
        System.out.println(user2.toString());
        User user3 = new User("Tony.A", 2016, 10, 'F' , 300.1 , "Web designer", false , "FALSE" , "Pizza");
        System.out.println(user3.toString());

    }

}
