package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AsusPage  extends MainPage {
    private WebDriver driver;
    public AsusPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy (xpath = "//h1[@itemprop='name']")
    WebElement asusPageTitle;

    @FindBy(xpath = "//div[@class='g-i-tile-l g-i-tile-catalog-hover-left-side clearfix']/child::div[@class=\"g-i-tile g-i-tile-catalog\"]")
    private List<WebElement> asusNoteBookList;

    @FindBy (xpath = "//img[@alt='Списком']")
    private WebElement clickListBtn;

    @FindBy (xpath = "//html//div[@class='g-i-list-middle-container']")
    private List<WebElement>sixteenItemsInList;

    @FindBy (xpath = "//span[@class='g-i-more-link-text']")
    private WebElement displayMoreItems;

    public AsusPage checkPageTitle(){
        asusPageTitle.getText();
        return new AsusPage(driver);
    }

    public void getItemsInList(int number) {
        asusNoteBookList.get(number);
    }
    public AsusPage clickToListBtn(){
        clickListBtn.click();
        return this;
    }
    public void checkItemsInList(int number){
        sixteenItemsInList.get(number);
    }
    public AsusPage clickToMoreItemsLink(){
        displayMoreItems.click();
        return this;
    }

}
