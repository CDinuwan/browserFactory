import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Project Name : sample-testing
 * Version : 1.0.0
 * Date : 6/18/2021
 * Time : 1:47 PM
 * Description :
 **/

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        DriverFactory.createInstance("chrome");
        driver = DriverFactory.getInstance();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
