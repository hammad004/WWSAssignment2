import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    private static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailInputBox;

    @FindBy(xpath = "//*[@id=\"passwd\"]")
    WebElement passwordInputBox;

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    WebElement createAccountEmailInputBox;

    @FindBy(className = "icon-lock left")
    WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(driver, this);
        webDriverWait.until(ExpectedConditions.urlContains(URL));

    }
}