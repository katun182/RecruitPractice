package tests;

import elements.Login;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    private Login login;

    @BeforeClass
    public void setup(){
        super.setup();
        login = new Login(driver);

    }
    @Test
    public void testThatLoginWorksWithCorrectUsernameAndPassword(){
        login.doLogin("admin","123admin@");
    }
}
