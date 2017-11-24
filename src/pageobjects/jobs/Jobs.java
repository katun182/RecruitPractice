package pageobjects.jobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jobs {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='sidebar-menu']/li[5]/a/span")
    WebElement jobs;


}
