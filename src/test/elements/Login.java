package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
   WebDriver driver;
   @FindBy(xpath = "html/body/div/div/div/form/div/div/div[1]/div/input")
    WebElement username;
   @FindBy(xpath = "html/body/div/div/div/form/div/div/div[2]/div/input")
    WebElement password;
   @FindBy(xpath = "html/body/div/div/div/form/div/div/button")
    WebElement loginBtn;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void setUsername(String usernameInput){
        username.sendKeys(usernameInput);
    }
    public void setPassword(String passwordInput){
        password.sendKeys(passwordInput);
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }
    public void doLogin(String usernameInput, String passwordInput){
        setUsername(usernameInput);
        setPassword(passwordInput);
        clickLoginBtn();
    }
}
