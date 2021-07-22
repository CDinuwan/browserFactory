import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Project Name : sample-testing
 * Version : 1.0.0
 * Date : 6/18/2021
 * Time : 1:10 PM
 * Description :
 **/

public class SearchTest extends BaseTest {

    private MyAccountPage myAccountPage;

    @BeforeMethod
    public void setDriverForMyAccountPage(){
        myAccountPage = new MyAccountPage(driver);
    }

    @Test
    public void testValidProduct() {
        myAccountPage.searchProduct("t-shirt");

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertEquals(searchResultPage.getSearchResultName(), "Faded Short Sleeve T-shirts");
        Assert.assertEquals(searchResultPage.getSearchResultPrice(), "$16.51");
    }

    @Test
    public void testInvalidProduct() {
        myAccountPage.searchProduct("watch");

        SearchResultPage searchResultPage = new SearchResultPage(driver);
        Assert.assertEquals(searchResultPage.getSearchResultNotFound(), "No results were found for your search \"watch\"");
        Assert.assertEquals(searchResultPage.getSearchResultCountMsg(), "0 results have been found.");
    }
}
