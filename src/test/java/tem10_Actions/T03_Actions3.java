package tem10_Actions;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class T03_Actions3 extends TestBase {

    @Test
    public void scrollUpDownTest() {
        //https://techproeducation.com a git
        //Sayfanin altina dogru gidelim.
        //Sonra sayfanin üstüne dogru gidelim


        //https://techproeducation.com a git
        driver.get("https://techproeducation.com");

        //Sayfanin altina dogru gidelim.
        Actions actions = new Actions(driver);
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(3);
                //Boyle tek seferde de yapabiliriz ama aralara bekleme süresi koyamıyoruz burada
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

             //  ARROW_DOWN   PAGE_DOWN dan az mesafe aldirir.

                //Sonra sayfanin üstüne dogru gidelim.
                // YUKARI CIK
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).perform();

    }
}
