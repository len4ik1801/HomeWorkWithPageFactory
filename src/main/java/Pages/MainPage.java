package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    public WebDriver driver;

    @FindBy (xpath = "(//a[contains(@href,'https://my.rozetka.com.ua/signup/')])[1]")
    private WebElement signUpLink;

    @FindBy (xpath = "//span[@name =\"auth-btn\"]")
    private WebElement signBtn;


    @FindBy (xpath = "//h2[@class = \"empty-cart-title inline sprite-side\"]")
    private WebElement basketEmptyTitle;

    @FindBy(xpath = "//a[@href='https://rozetka.com.ua/credit/']")
    private WebElement clickCreditLink;

    @FindBy (xpath = "//li[@class='f-menu-sub']//a[@href='https://rozetka.com.ua/notebooks/c80004/']")
    private WebElement noteBooksLink;





    public MainPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MainPage clickToSignUpLink(){
        signUpLink.click();
        return this;
    }
    public  MainPage clickToSignUpBtn(){
        signBtn.click();
        return this;
    }

    public MainPage lookToBasketEmptyTitle(){
        basketEmptyTitle.getText();
        return this;
    }
    public CreditsPage clickToCreditLink(){
        clickCreditLink.click();
        return new CreditsPage(driver);
    }
    public NoteBooksPage clickNoteBooksLink(){
        noteBooksLink.click();
        return new NoteBooksPage(driver);
    }



}


