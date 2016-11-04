package AutoTestLesson2;

import org.testng.Assert;
import org.testng.annotations.Test;
import userData.User;


public class UserTest {

    @Test
    public void testMyUser() {
        User testUser = new User();

        Assert.assertNotNull(testUser.getUsername());
        Assert.assertEquals(testUser.getUsername(), "TestUsername");
    }

    @Test
    public void testMySecondUser() {
        User testUser = new User("qwerty", 123456);

//        Assert.assertEquals("qwerty", testUser.getUsername());
        Assert.assertEquals(123456, testUser.getPassword());
    }

    @Test
    public void testMyThirdUser() {
        User user1 = new User("test", 123);
        User user2 = new User(user1);
        Assert.assertEquals(user1.getUsername(), user2.getUsername());
        Assert.assertEquals(user1.getPassword(), user2.getPassword());
    }
@Test
    public void firstUserAverageSalary(){

    User user1 = new User("Gani.P", 2014, 53, 'M' , 142.64 , "Java developer", false , "true" , "Sushi"  );
    User user2 = new User("Niru.X", 2015, 167, 'F' , 280 , "Byssines Analyst", true , "false" , "Burger"  );
    User user3 = new User("Tony.A", 2016, 10, 'F' , 300.1 , "Web designer", false , "false" , "Pizza" );

    Assert.assertEquals(142.64,  user1.getAveregeSalaryLastYear());
    Assert.assertEquals(true, user2.isHadPreviousJob(true));
    Assert.assertEquals( user3.getAgreeToTravelAbroad() , "false");
    Assert.assertEquals( user1.getBestMeal(), user3.getBestMeal() );

}


}
