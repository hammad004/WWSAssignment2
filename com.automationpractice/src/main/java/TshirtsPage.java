import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TshirtsPage extends BasePage {
    private static final String URL = "http://automationpractice.com/index.php?id_category=5&controller=category";

    @FindBy(xpath = "//*[@id=\"selectProductSort\"]")
    WebElement tShirtDropDownList;

    @FindBy(xpath = "//*[@id=\"uniform-selectProductSort\"]/span")
    WebElement priceLowestFirst;

    @FindBy(className = "available-now")
    WebElement inStockElement;


    public TshirtsPage() {
        PageFactory.initElements(driver, this);
        webDriverWait.until(ExpectedConditions.urlContains(URL));
    }
}