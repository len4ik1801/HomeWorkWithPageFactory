package Tests;
import Pages.CreditsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class CreditsTest extends MainTest{

    @Test
    public void checkCreditTable(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        CreditsPage creditsPage = PageFactory.initElements(driver,CreditsPage.class);
        Assert.assertEquals("5", "20");
    }
}
