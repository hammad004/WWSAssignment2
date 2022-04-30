
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTShirtsPage extends TestBasePage {
    @Test
    public void TestTshirtpage() {
        HomePage homepage = new HomePage();
        TshirtsPage tshirtspage = new TshirtsPage();
        homepage.tShirtsTab.click();
        tshirtspage.tShirtDropDownList.click();
        tshirtspage.priceLowestFirst.click();
        Assert.assertTrue(isElementVisible(tshirtspage.inStockElement));
    }
}