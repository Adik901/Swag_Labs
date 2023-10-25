import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TEST_LOGIN_PAGE {


    private WebDriver driver;
    private LOGIN_PAGE LOGINPAGE;

    @Before
    public void setUp() {
        System.setProperty("WebDriver.chrome.driver",
                "/Users/adik/Downloads/Selenium instal.zip/Chromedriver-mac-arm64/116.0.5845.96/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        LOGINPAGE = new LOGIN_PAGE(driver);
    }
    @Test
    public void SignInPass() {
      LOGIN_PAGE loginpage = LOGINPAGE.ToSignIn("standard_user","secret_sauce");
      String error = loginpage.getSwagLabs();
      Assert.assertEquals("Swag Labs",error);
    }
    @Test
    public void SwagLabs() {
        LOGIN_PAGE loginpage = LOGINPAGE.ToSignIn("standard_user","secret_sauce");

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
