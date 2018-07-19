package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends MainPage {

    private WebDriver driver;
    public RegistrationPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//a[@href='https://my.rozetka.com.ua/signup/']")
    private WebElement signUpLink;

    @FindBy(xpath = "//html//div[1]/input[1]")
    private WebElement typeName;

    @FindBy(xpath = "//html//div[@class='clearfix content']//div[2]/input[1]")
    private WebElement typeEmail;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement typePassword;

    @FindBy(xpath = "//button[@class='btn-link-i'][contains(text(),'Зарегистрироваться')]")
    private WebElement clickSignUpBtn;




    public RegistrationPage clickSignUpLink(){
        signUpLink.click();
        return this;
    }

    public RegistrationPage enterName(String name){
        typeName.sendKeys(name);
        return this;

    }
     public RegistrationPage enterEmail(String email){
        typeEmail.sendKeys(email);
        return this;
     }

    public RegistrationPage enterPassword(String password){
        typePassword.sendKeys(password);
        return this;
    }
    public void clickSignUpBtn(){
        clickSignUpBtn.click();
        new HomePage(driver);
    }


    public HomePage registration (String name, String email, String password){
        this.enterName(name);
        this.enterEmail(email);
        this.enterPassword(password);
        this.clickSignUpBtn();
        return new HomePage(driver);

    }

}

