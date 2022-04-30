import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DressesPage extends BasePage {
    private static final String URL = ("http://automationpractice.com/index.php?id_category=8&controller=category");

    @FindBy(linkText = "http://automationpractice.com/index.php?id_category=8&controller=category#availability-in_stock")
    WebElement inStockCheckbox;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div[4]/p")
    WebElement notInStockAlert;

    public DressesPage() {PageFactory.initElements(driver, this);
        webDriverWait.until(ExpectedConditions.urlContains(URL));
    }
}

