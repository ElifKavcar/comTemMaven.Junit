package tem10_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class T01_Actions extends TestBase {

    @Test
    public void rightClick() {

        //https://the-internet.herokuapp.com/context_menu sitesine gidin.
        //Kutuya sag tiklayin.
        //Alert te cikan yazinin "You selected a context menu" oldugunu test edin.
        //Tamam diyerek alert i kapatin.

            //https://the-internet.herokuapp.com/context_menu sitesine gidin.
        driver.get("https://the-internet.herokuapp.com/context_menu");

                //   1. ACTIONS OBJESI OLUSTUR.
        Actions actions = new Actions(driver);

            //  2. ELEMENT I LOCATE EDELIM
        WebElement kutu = driver.findElement(By.id("hot-spot"));

            //Kutuya sag tiklayin.
        actions.contextClick(kutu).perform(); // Tum Actions lar actions ile baslar perform ile biter.
waitFor(3);

            //Alert te cikan yazinin "You selected a context menu" oldugunu test edin.
        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());
waitFor(3);

            //Tamam diyerek alert i kapatin.
        driver.switchTo().alert().accept();

    }
}
