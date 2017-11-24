package tests;

import elements.Login;
import org.testng.annotations.BeforeClass;



public class BaseTestLogin extends BaseTest {

    @BeforeClass
    public void setup(){
        super.setup();
        new Login(driver).doLogin("admin","123admin@");
    }
}
