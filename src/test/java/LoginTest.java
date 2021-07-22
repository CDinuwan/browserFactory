import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testValidateLogin() {
        LoginPage loginPage = new LoginPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        loginPage.login("kevin.demno@test.com", "password6264QQ");

        Assert.assertEquals(driver.getTitle(), "My account - My Store");
        Assert.assertEquals(myAccountPage.getUsername(), "Kevin Demno");
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("kevin.demno2@test.com", "password6264QQ");

        Assert.assertEquals(driver.getTitle(), "Login - My Store");
    }
}
