package Tests;

import Pages.HomePage;
import Pages.RegistrationPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationTest extends MainTest {
    @Test
    public void sigUpToSite(){
        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        registrationPage.clickSignUpLink();
        registrationPage.enterName("Selena8");
        registrationPage.enterEmail("selena8@yopmail.com");
        registrationPage.enterPassword("123Qwerty");
        registrationPage.clickSignUpBtn();
        WebElement heading = homePage.getHeadingText();
        Assert.assertEquals("Личные данные", homePage.getHeadingText());


    }

}
