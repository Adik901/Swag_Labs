import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Swag_Labs_Page {
    private static WebDriver driver;
    public Swag_Labs_Page(WebDriver driver){
        this.driver=driver;
    }
    private static By product_sort_container = By.xpath("//select[@class='product_sort_container']");


    public static Swag_Labs_Page click_product_sort_container(){
        driver.findElement(product_sort_container).click();
        return new Swag_Labs_Page(driver);
    }
}
