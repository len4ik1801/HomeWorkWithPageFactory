package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NoteBooksPage extends MainPage{
    private WebDriver driver;
    public NoteBooksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//a[@class='m-cat-subl-i-link'][contains(text(),'Asus')]")
    private WebElement asusLink;

    @FindBy (xpath = "//a[@class='m-cat-subl-i-link'][contains(text(),'10 000 грн - 12 999 грн')]")
    private WebElement filterLink;

    @FindBy (xpath = "//html//div[@class='container']/div[3]/div[1]")
    private List<WebElement> numberOfBrands;

    public AsusPage clickAssusLink(){
        asusLink.click();
        return new AsusPage(driver);
    }

    public NoteBooksPage clickFilterLink(){
        filterLink.click();
        return this;
    }
    public void CheckBrandsNumber (){
        numberOfBrands.size();
    }

}
