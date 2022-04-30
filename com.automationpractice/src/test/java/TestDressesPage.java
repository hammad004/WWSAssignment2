import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDressesPage extends TestBasePage{
    @Test
    public void TestInStockBox(){
        HomePage homepage = new HomePage();
    DressesPage dressespage = new DressesPage();
    homepage.dressesTab.click();
    dressespage.inStockCheckbox.click();
        Assert.assertTrue(dressespage.isElementVisible(dressespage.notInStockAlert));
    }
    }
