package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setup(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,120);
        driver.manage().window().maximize();
        driver.get("http://qa-recruitsystem.ekbana.info/system");
    }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}





