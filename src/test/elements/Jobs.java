package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jobs {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='sidebar-menu']/li[5]/a/span")
    WebElement jobs;

    public Jobs(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    public void gotoJobsLink(){
        new Actions(driver).moveToElement(jobs).build().perform();
        new WebDriverWait(driver,120).until(ExpectedConditions.visibilityOf(jobs)).click();
    }

}
