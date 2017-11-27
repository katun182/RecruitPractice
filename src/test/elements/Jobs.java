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
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div[3]/div/textarea")
    WebElement jobDescription;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div[4]/div/div/div[12]/label/input")
    WebElement skillRequired;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div[4]/div/div/div[17]/label/input")
    WebElement language;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div[4]/div/div/div[21]/label/input")
    WebElement companies;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div[4]/div/div/div[24]/label/input")
    WebElement qweu;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div[4]/div/div/div[28]/label/input")
    WebElement copies;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div[4]/div/div/div[30]/label/input")
    WebElement webDevelopment;



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
    }
    public void setJobProvider(String jobProviderText){
        Select dropdown = new Select(jobProvider);
        dropdown.selectByVisibleText(jobProviderText);
    }
    public void setJobDescription(String jobDescriptionInput){
        jobDescription.sendKeys(jobDescriptionInput);
    }
    public void setSkillRequired(){
        skillRequired.click();
    }
    public void setLanguage(){
        language.click();
    }
    public void setCompanies(){
        companies.click();
    }
    public void setQweu(){
        qweu.click();
    }
    public void setCopies(){
        copies.click();
    }
    public void setWebDevelopment(){
        webDevelopment.click();
    }


}
