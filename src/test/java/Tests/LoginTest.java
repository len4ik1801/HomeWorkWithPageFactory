package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

@RunWith(JUnit4.class)
public class LoginTest extends MainTest {
    @Test
    public void loginToSite(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        loginPage
                .typeLogin("lenok1@appcreative.net")
                .typePassword("123Qwerty")
                .clickLoginBtn();
        Assert.assertEquals(homePage, "Lenok1");
    }

}
