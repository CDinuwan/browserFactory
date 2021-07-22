import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Project Name : sample-testing
 * Version : 1.0.0
 * Date : 4/27/2021
 * Time : 12:12 AM
 * Description :
 **/

public class LoginPage {
    private final By emailTextBox = By.xpath("//input[@name='email']");
    private final By passwordTextBox = By.xpath("//input[@id='passwd']");
    private final By signInButton = By.id("SubmitLogin");
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailTextBox(String email) {
        driver.findElement(emailTextBox).sendKeys(email);
    }

    public void setPasswordTextBox(String password) {
        driver.findElement(passwordTextBox).sendKeys(password);
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void login(String email, String password) {
        setEmailTextBox(email);
        setPasswordTextBox(password);
        clickSignInButton();
    }
}
