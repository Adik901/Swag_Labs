import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LOGIN_PAGE {
    //                                                  Конструктор
//                                                  privete WebDriver driver
    private WebDriver driver;
    public LOGIN_PAGE (WebDriver driver) {
        this.driver = driver;
    }
    //                                  Нахожу все что нужно найти на сайте

    private By Username = By.xpath("//input[@type='text']");
    private By Password = By.xpath("//input[@id='password']");
    private By LoginButton = By.xpath("//input[@id='login-button']");
    private By SwagLabs = By.xpath("//div[text()='Swag Labs']");

    //                                  Методы с помощью которых  xPath начинает работать
    public LOGIN_PAGE TypeUsername (String username) {
        driver.findElement(Username).sendKeys(username);
        return this;
    }
    public LOGIN_PAGE TypePassword (String password) {
        driver.findElement(Password).sendKeys(password);
        return this;
    }
    //                                   Метод для входа вписанный в один код
    public LOGIN_PAGE ToSignIn (String USER_NAME, String PASSWORD){
        this.TypeUsername(USER_NAME);
        this.TypePassword(PASSWORD);
        driver.findElement(LoginButton).click();
        return new LOGIN_PAGE(driver);
    }
// проверка текста если перешел на страницу
    public String getSwagLabs () {
        return driver.findElement(SwagLabs).getText();
    }
}

