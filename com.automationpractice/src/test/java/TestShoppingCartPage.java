import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShoppingCartPage extends TestBasePage{

    @Test
    public void TestShoppingCartButton(){
        ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
        shoppingcartpage.shoppingCartButton.click();
        Assert.assertTrue(isElementVisible(shoppingcartpage.cartPageTitle));
    }
}
