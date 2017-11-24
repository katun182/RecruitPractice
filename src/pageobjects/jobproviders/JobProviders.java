package pageobjects.jobproviders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JobProviders {
    WebDriver driver;

    @FindBy(xpath = ".//*[@id='sidebar-menu']/li[3]/a/span")
    WebElement jobProviders;
    @FindBy(xpath = ".//*[@id='page-title']/div/a")
    WebElement addNewJobProviderBtn;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/div/form/div[1]/div/input")
    WebElement nameInput;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/div/form/div[2]/div/input")
    WebElement companyNameInput;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/div/form/div[3]/div/input")
    WebElement emailInput;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/div/form/div[4]/div/input")
    WebElement phoneInput;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/div/form/div[5]/div/input")
    WebElement addressInput;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/div/form/div[7]/div/button")
    WebElement saveBtn;
    @FindBy(xpath = ".//*[@id='page-content']/div[5]/div/form/div/div[3]/div/input")
    WebElement searchBox;




    public JobProviders(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }
    public void gotoJobProvidersLink(){
        new Actions(driver).moveToElement(jobProviders).build().perform();
        new WebDriverWait(driver,2).until(ExpectedConditions.visibilityOf(jobProviders)).click();
    }
    public void gotoAddNewJobProviderBtn(){
        addNewJobProviderBtn.click();
    }
    public void setName(String fullName){
        nameInput.sendKeys(fullName);
    }
    public void setCompanyName(String companyName){
        companyNameInput.sendKeys(companyName);
    }
    public void setEmail(String email){
        emailInput.sendKeys(email);
    }
    public void setPhone(String phone){
        phoneInput.sendKeys(phone);
    }
    public void setAddress(String address){
        addressInput.sendKeys(address);
    }
    public void clickSaveBtn(){
        saveBtn.click();

    }
    public void gotoSearchBox(String name){
        searchBox.click();
        searchBox.sendKeys(name);
    }



}
