package Tests;



import Pages.MainPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

abstract public class MainTest {

    public static ChromeDriverService service;
    public static WebDriver driver;
    public static WebDriverWait wait;

//    @BeforeClass
//    public static void createAndStartService() throws IOException {
//        System.out.println("beforeClass");
//        wait = new WebDriverWait(driver, 10);
//        service = new ChromeDriverService.Builder()
//                .usingDriverExecutable(new File("src/drivers/chromedriver"))
//                .usingAnyFreePort()
//                .build();
//        service.start();
//        driver = new RemoteWebDriver(service.getUrl(),
//                DesiredCapabilities.chrome());
//
//    }

    @BeforeTest
    public void enterToTheSite() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("src/drivers/chromedriver"))
                .usingAnyFreePort()
                .build();
        service.start();

        driver = new RemoteWebDriver(service.getUrl(),
                DesiredCapabilities.chrome());

        wait = new WebDriverWait(driver, 10);



        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua");


    }

   /* @AfterTest
    public void asasas() {
        driver.quit();
        service.stop();

    }*/

    @AfterTest
    public static void createAndStopService() {
        driver.quit();
        service.stop();

    }


}

