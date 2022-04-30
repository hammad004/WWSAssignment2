import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;

import java.io.File;

public class HomePage extends BasePage {
    public static final String URL = "http://automationpractice.com/index.php";

    @FindBy (xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public WebElement womensTab;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public WebElement dressesTab;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement tShirtsTab;

    @FindBy (linkText = "http://automationpractice.com/index.php?controller=my-account")
    WebElement signInButton;

    @DataProvider(name = "test-Data")
    public Object[][] dataProviderFunction(){
        return new Object[][]{
                {"auto"}, {"mation"}
        };

        }
    public HomePage() {PageFactory.initElements(driver, this);
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        File myFile = new File("C:\\Users\\go2ah\\IdeaProjects\\WWSAssignment2\\com.automationpractice\\src");
    }
}


