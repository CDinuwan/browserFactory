import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

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
        DriverFactory.createInstance("edge");
        driver = DriverFactory.getInstance();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
