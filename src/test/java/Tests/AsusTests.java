package Tests;

import Pages.AsusPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AsusTests extends MainTest {

    @Test
    protected void checkNumberOfElements(){
        AsusPage asusPage = PageFactory.initElements(driver, AsusPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        asusPage.checkItemsInList(32);
        Assert.assertEquals("asus", "asusPage.checkPageTitle()");

    }
}
