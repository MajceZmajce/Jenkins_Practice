package TAF;

import TAF.base.TestBase;
import TAF.pages.MainPage;
import TAF.pages.ResultPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class TestSuite extends TestBase {


    MainPage mainPage;
    ResultPage resultPage;


    //Log4j configuration
    private static final Logger log = LogManager.getLogger(TestSuite.class);


    @Test
    @Tag("smoke")
    public void navListButtonTest() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.navigationListMenu();

    }

    @Test
    @Tag("button")
    public void whatWeDoBtn() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.clickOnWhatWeDoButton();
    }

    @Test
    @Tag("button1")
    public void lifeAtBadinBtn() throws InterruptedException {
        mainPage = new MainPage(driver);
        mainPage.clickOnLifeAtBadinButton();
    }


}




