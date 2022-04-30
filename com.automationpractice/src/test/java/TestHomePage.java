import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestHomePage extends TestBasePage {
    @Test
    public void TestWomensTab(){
        HomePage homepage = new HomePage();
        WomenPage womenpage = new WomenPage();
        homepage.womensTab.click();
        womenpage.blackBlouseButton.click();

Assert.assertTrue(isElementVisible(womenpage.addToCartButton));

    }
    }


