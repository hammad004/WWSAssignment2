import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static base.BasePage.driver;
import static base.BasePage.webDriverWait;

public class WomenPage extends BasePage {
    private static final String URL = "http://automationpractice.com/index.php?id_category=3&controller=category";
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
    public WebElement fadedShortSleeveTshirtButton;

    @FindBy(xpath = "//*[@id=\"color_14\"]")
    public WebElement unSelectedColorOption;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    public WebElement addToCartButton;

    @FindBy(id = "wishlist_button")
    public WebElement addToWishListButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    public WebElement blackBlouseButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img")
    public WebElement printedDressButton;

    public WomenPage() {PageFactory.initElements(driver, this);
        webDriverWait.until(ExpectedConditions.urlContains(URL));
    }
}
