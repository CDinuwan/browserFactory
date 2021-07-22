import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Project Name : sample-testing
 * Version : 1.0.0
 * Date : 6/13/2021
 * Time : 3:39 PM
 * Description :
 **/

public class MyAccountPage {
    private final WebDriver driver;

    private final By usernameButton = By.xpath("//div[@class='header_user_info']//span");
    private final By searchTextBox = By.id("search_query_top");
    private final By submitSearchButton = By.name("submit_search");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUsername() {
        return driver.findElement(usernameButton).getText();
    }

    public void searchProduct(String product) {
        driver.findElement(searchTextBox).sendKeys(product);
        driver.findElement(submitSearchButton).click();
    }
}
