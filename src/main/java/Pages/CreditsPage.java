package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CreditsPage extends MainPage{
    private WebDriver driver;
    public CreditsPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (xpath = "//html//div[3]/table[1]")
    List<WebElement> creditTable;
    public void findItemFromTable() {
        int columnPositionOfTopRow = 0;
        for (int i = 0; i <= creditTable.size(); i++) {
            if (creditTable.get(i).getText().equals("credit 20 mes")) columnPositionOfTopRow = i;
            break;

    }}
}









