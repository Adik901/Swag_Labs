import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TEST_Swag_Labs_Page {
    private WebDriver DRIVER;
    private LOGIN_PAGE SWAG_LABS_PAGE;

    @BeforeClass
    public void setUp() {
        System.setProperty("WebDriver.chrome.driver",
                "/Users/adik/Downloads/Selenium instal.zip/Chromedriver-mac-arm64/116.0.5845.96/chromedriver");
        DRIVER = new ChromeDriver();
        DRIVER.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        DRIVER.manage().window().maximize();
        DRIVER.get("https://www.saucedemo.com/");
        SWAG_LABS_PAGE = new LOGIN_PAGE(DRIVER);

    }
    @Before
    public void SignInPass() {
        LOGIN_PAGE loginpage = SWAG_LABS_PAGE.ToSignIn("standard_user","secret_sauce");
        String error = loginpage.getSwagLabs();
        Assert.assertEquals("Swag Labs",error);
    }
    @Test
    public void SwagLabs() {
       Swag_Labs_Page swagLabsPage= Swag_Labs_Page.click_product_sort_container();

    }

    @After
    public void tearDown() {
        DRIVER.quit();
    }
}