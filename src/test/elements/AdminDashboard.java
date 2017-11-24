package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdminDashboard {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='sidebar-menu']/li[1]/a/span")
    WebElement adminDashboard;

    public AdminDashboard(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver= driver;
    }
    public void gotoAdminDashboardLink(){
        new Actions(driver).moveToElement(adminDashboard).build().perform();
    }

}
