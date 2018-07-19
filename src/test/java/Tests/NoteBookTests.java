package Tests;

import Pages.AsusPage;
import Pages.MainPage;
import Pages.NoteBooksPage;
import Pages.PageNoteBookWithFilter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NoteBookTests extends MainTest {

    @Test
    public void checkListOfProducts(){
        NoteBooksPage noteBooksPage = PageFactory.initElements(driver, NoteBooksPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(true, "8");

    }
    @Test
    public void goToAsusPage(){
        NoteBooksPage noteBooksPage = PageFactory.initElements(driver, NoteBooksPage.class);
        AsusPage asusPage = PageFactory.initElements(driver, AsusPage.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        noteBooksPage.clickAssusLink();
        Assert.assertEquals("AsusPage", asusPage.checkPageTitle());
    }
    @Test
    public void goToNoteBookWithFilterPage(){
        NoteBooksPage noteBooksPage = PageFactory.initElements(driver, NoteBooksPage.class);
        PageNoteBookWithFilter pageNoteBookWithFilter = PageFactory.initElements(driver, PageNoteBookWithFilter.class);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        noteBooksPage.clickFilterLink();
        Assert.assertEquals("от 1000 до 12999", pageNoteBookWithFilter.checkFilterText("от 1000 до 12999"));
    }
}
