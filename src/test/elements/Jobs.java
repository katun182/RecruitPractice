package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jobs {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='sidebar-menu']/li[5]/a/span")
    WebElement jobs;
    @FindBy(xpath = ".//*[@id='page-title']/div/a/i")
    WebElement addNewJobBtn;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div[1]/div/input")
    WebElement jobTitle;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div[2]/div/select")
    WebElement jobProvider;

    public Jobs(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    public void gotoJobsLink(){
        new Actions(driver).moveToElement(jobs).build().perform();
        new WebDriverWait(driver,120).until(ExpectedConditions.visibilityOf(jobs)).click();
    }
    public void gotoAddNewJobLink(){
        new Actions(driver).moveToElement(addNewJobBtn).build().perform();
        new WebDriverWait(driver,120).until(ExpectedConditions.visibilityOf(addNewJobBtn)).click();
    }
    public void setJobTitle(String jobTitleInput){
        jobTitle.sendKeys(jobTitleInput);
        new WebDriverWait(driver,120);
    }
    public void setJobProvider(String jobProviderText){
        Select dropdown = new Select(jobProvider);
        dropdown.selectByVisibleText(jobProviderText);
    }

}
