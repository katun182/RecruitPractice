package test.tests;

import org.testng.annotations.BeforeClass;
import pageobjects.login.Login;

public class BaseTestLogin extends BaseTest {
    protected Login login;

    @BeforeClass
    public void setup(){
        super.setup();
        new Login(driver).doLogin("admin","123admin@");
    }
}
