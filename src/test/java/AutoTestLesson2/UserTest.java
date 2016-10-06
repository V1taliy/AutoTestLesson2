package AutoTestLesson2;

import org.junit.Assert;
import org.testng.annotations.Test;


public class UserTest{

    @Test
    public void testMyUser(){
User asd = new User();
        String username = asd.getUsername();

        Assert.assertNotNull(username);
        Assert.assertEquals(username, "TestUsername") ;   }
        }
