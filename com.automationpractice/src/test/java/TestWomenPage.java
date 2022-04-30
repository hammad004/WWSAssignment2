import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWomenPage extends TestBasePage {
    @Test
    public void TestWomensTab(){
        HomePage homepage = new HomePage();
        WomenPage womenpage = new WomenPage();
        homepage.womensTab.click();
        womenpage.blackBlouseButton.click();

        Assert.assertTrue(isElementVisible(womenpage.addToCartButton));
}
    }
