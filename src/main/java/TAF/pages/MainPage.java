package TAF.pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static com.google.gson.internal.bind.TypeAdapters.URL;


public class MainPage {
    WebDriver driver;
    WebDriverWait wait;

    private static final Logger log = LogManager.getLogger(MainPage.class);

    @FindBy(id = "navBtnDesktop")
    WebElement hamburger;
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement aboutUS;

    @FindBy(xpath = "//*[contains(@class, 'hero-button')]/a")
    WebElement whatWeDo;

    @FindBy(xpath = "//*[contains(@class, 'hero-button')]/a[2]")
    WebElement lifeAtBadin;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 3);
    }

    public void navigationListMenu() throws InterruptedException {
        hamburger.click();
        Thread.sleep(5000);
        //    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navigation-desktop")));
        aboutUS.click();
    }

    public void clickOnWhatWeDoButton() throws InterruptedException {
        whatWeDo.click();
        Thread.sleep(5000);
    }

    public void clickOnLifeAtBadinButton() throws InterruptedException {
        lifeAtBadin.click();
        Thread.sleep(5000);
    }
}

