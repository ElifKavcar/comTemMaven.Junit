package practise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P18_BuyukKucukHarf extends TestBase {

    @Test
    public void buyukKucukHarfTest() {

        //google sayfasina gidelim
        driver.get("https://www.google.com");

        //buyuk kucuk harf olacak sekilde Hello yazdiralim
        WebElement searcBox = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        searcBox.sendKeys(Keys.SHIFT, "h",Keys.SHIFT, "e",Keys.SHIFT, "l",Keys.SHIFT, "l",Keys.SHIFT, "o");

        //HeLlO yazıyor bir büyük bir küçük ikinci shift elini shiftten cek oluyor


    }
}
