package practise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class P12_HandleWindow extends TestBase {

    @Test
    public void test01() {
        //https://www.amazon.com adresine gidiniz
        //Sayfa nin window handle degerini String bir degiskene atayin
        //Sayfa title nin "Amazon" icerdigini test edin
        //Yeni bir tab olusturup, acilan tab da techproeducation adresine gidin
        //Sayfa title nin "Techproeducation" icerdigini test edin
        //Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin.
        //Sayfa title nin "Walmart" icerdigini test edin
        //ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin


        driver.get("https://www.amazon.com");
        String amazonWindowHandle = driver.getWindowHandle();
        String amazonTitle = driver.getTitle();
        Assert.assertTrue(amazonTitle.contains("Amazon"));

        driver.switchTo().newWindow(WindowType.TAB);//Yeni bir sekme acmis olduk
        driver.get("https://techproeducation.com");
        String techTitle = driver.getTitle();
        String istenen = "TECHPROEDUCATION";
        Assert.assertFalse(techTitle.contains(istenen));

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.walmart.com");

        String walmTitle = driver.getTitle();
        String beklenen = "Walmart";
        Assert.assertTrue(walmTitle.contains(beklenen));

        driver.switchTo().window(amazonWindowHandle);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,actualUrl);






    }
}
