package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageNoteBookWithFilter extends MainPage{
    private WebDriver driver;
    public PageNoteBookWithFilter (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//a[@class='filter-active-i-link novisited sprite-side']")
    WebElement filterText;

    @FindBy (xpath = "//a[@class='filter-active-i-link novisited filter-active-i-link-reset sprite-side']")
    WebElement ckickToCancelFilter;

    public PageNoteBookWithFilter checkFilterText(String text){
        filterText.getText();
        return this;
    }
    public PageNoteBookWithFilter clickCancelBtn(){
        ckickToCancelFilter.click();
        return this;
    }
}

