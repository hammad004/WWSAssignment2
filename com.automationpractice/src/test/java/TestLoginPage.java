import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends TestBasePage{

    @Test
public void TestLogin(){
        HomePage homepage = new HomePage();
        LoginPage loginpage = new LoginPage();
        homepage.signInButton.click();
        loginpage.emailInputBox.sendKeys("sami@piit.us");
        loginpage.passwordInputBox.sendKeys("Test123");
        loginpage.loginButton.click();

        String expectedText = "Welcome to your account. Here you can manage all of your personal information and orders.";
        Assert.assertTrue(Boolean.parseBoolean(expectedText));
    }
    @Test
    public void invalidLoginTest(){
        HomePage homepage = new HomePage();
        LoginPage loginpage = new LoginPage();
        homepage.signInButton.click();
        loginpage.emailInputBox.sendKeys("randomemail@gmail.com");
        loginpage.passwordInputBox.sendKeys("random123");
        String expectedText = "Authentication failed";
        Assert.assertTrue(Boolean.parseBoolean(expectedText));


    }
}
