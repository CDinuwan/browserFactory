import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Project Name : sample-testing
 * Version : 1.0.0
 * Date : 6/18/2021
 * Description :
 * Time : 1:10 PM
 **/

public class SearchResultPage {
    private final WebDriver driver;

    private final By searchResultName = By.xpath("//h5[@itemprop='name']//a");
    private final By searchResultPrice = By.xpath("//div[@class='right-block']//span[@itemprop='price']");
    private final By searchResultCountMsg = By.xpath("//div[@id='center_column']//span");
    private final By searchResultNotFoundMsg = By.xpath("//div[@id='center_column']//p");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSearchResultName() {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchResultName));
        return driver.findElement(searchResultName).getText().trim();
    }

    public String getSearchResultPrice() {
        return driver.findElement(searchResultPrice).getText();
    }

    public String getSearchResultCountMsg() {
        return driver.findElement(searchResultCountMsg).getText().trim();
    }

    public String getSearchResultNotFound() {
        return driver.findElement(searchResultNotFoundMsg).getText().trim();
    }

}
