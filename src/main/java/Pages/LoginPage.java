package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends MainPage{
        private WebDriver driver;
    public LoginPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "*//input[@name = 'login']")
    private WebElement loginName;

    @FindBy(xpath = "*//input[@name = 'password']")
    private WebElement logPassw;

    @FindBy (xpath = "*//button[@name = 'auth_submit']")
    private WebElement loginBtn;

    @FindBy (xpath = "*//a[@name = 'close']")
    private WebElement cancelLink;

    @FindBy (xpath = "//a[@name = 'profile']")
    private WebElement profileLink;




    public LoginPage typeLogin(String login){
        loginName.sendKeys(login);
        return this;
    }

    public LoginPage typePassword(String password){
        logPassw.sendKeys(password);
        return this;
    }
    public LoginPage clickLoginBtn(){
        loginBtn.click();
        return this;
    }
    public LoginPage clickCancelLink(){
        cancelLink.click();
        return this;
    }
    public LoginPage clickProfileLink(){
        profileLink.click();
        return this;
    }
    public LoginPage login (String login, String password){
        this.typeLogin(login);
        this.typePassword(password);
        this.clickLoginBtn();
        return new LoginPage(driver);
    }


}
