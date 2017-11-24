package tests;

import elements.Login;
import org.testng.annotations.BeforeMethod;


public class BaseTestLogin extends BaseTest {

    @BeforeMethod
    public void setup(){
        super.setup();
        new Login(driver).doLogin("admin","123admin@");
    }
}
