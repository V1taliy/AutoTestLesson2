package AutoTestLesson2;

import org.junit.Assert;
import org.testng.annotations.Test;


public class UserTest {

    @Test
    public void testMyUser() {
        User testUser = new User();
//        String username = testUser.getUsername();
//        testUser.setUsername("TestUsername");
        Assert.assertNotNull(testUser.getUsername());
        Assert.assertEquals(testUser.getUsername(), "TestUsername");
    }

    @Test
    public void testMySecondUser() {
        User testUser = new User("qwerty", 123456);
//        testUser.setUsername("qwerty");
//        testUser.setPassword(123456);
        Assert.assertEquals("qwerty", testUser.getUsername());
        Assert.assertEquals(123456, testUser.getPassword());
    }

    @Test
    public void testMyThirdUser() {
        User user1 = new User("test", 123);
        User user2 = new User(user1);
        Assert.assertEquals(user1.getUsername(), user2.getUsername());
        Assert.assertEquals(user1.getPassword(), user2.getPassword());
    }


}
