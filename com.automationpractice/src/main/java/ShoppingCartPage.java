import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static base.BasePage.driver;
import static base.BasePage.webDriverWait;

public class ShoppingCartPage extends BasePage {
    private static final String URL = "http://automationpractice.com/index.php?controller=order";

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    WebElement shoppingCartButton;

    @FindBy(id = "cart_title")
    WebElement cartPageTitle;

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
        webDriverWait.until(ExpectedConditions.urlContains(URL));
    }
}
