package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends MainPage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//h1[contains(text(),'Личные данные')]")
    private WebElement headingReg;

    @FindBy(xpath = "//a[@href='https://rozetka.com.ua/computers-notebooks/c80253/'][contains(text(),'Ноутбуки и компьютеры')]")
    private WebElement noteBooksAndComputers;

    @FindBy(xpath = "//h1[@class='pab-h1']")
    private WebElement productsPageTitle;

    @FindBy(xpath = "//a[@class='pab-h3-link'][contains(text(),'Ноутбуки')]")
    private WebElement notebooksCategory;



    public WebElement getHeadingText() {
        return driver.findElement(By.id(headingReg.getText()));
    }

    public HomePage clickToNotebookLink (){
        noteBooksAndComputers.click();
        return this;
    }

    public NoteBooksPage clickToNotebookCategory(){
        notebooksCategory.click();
        return new NoteBooksPage(driver);
    }

}
