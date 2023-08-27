package tem11_Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class T01_Actions5 extends TestBase {

    @Test
    public void keyboardActionsTest() {

        //Google a gidin
        //"iPhone X fiyatlari" yazdir(SHİFT TUSUNA BASILARAK)
        //"COK PAHALİ!" yazdir(SHIFT TUSUNA BASILMAYARAK)
        //Ve ENTER tusuna basin

                //Google a gidin
        driver.get("https://www.google.com");

                //"iPhone X fiyatlari" yazdir(SHİFT TUSUNA BASILARAK)
        WebElement aramaKutusu = driver.findElement(By.name("q"));
              // aramaKutusu.sendKeys("iPhone X fiyatlari"+ Keys.ENTER);

        Actions actions = new Actions(driver);

        actions
                .keyDown(aramaKutusu,Keys.SHIFT)  // arama kutusunun ustunde Shift tusuna bas
                .sendKeys("iPhone X fiyatlari") //shifte basiliyken yazi yaz
                .keyUp(aramaKutusu,Keys.SHIFT) //shifte artik basma
                .sendKeys(" cok pahali! " + Keys.ENTER) //normal halde yaz ve Enter tusuna bas
                .build()  //  birden fazla actions methodu kullanildiginda build() kullanilmasi onerilir.
                .perform();
        //"COK PAHALİ!" yazdir(SHIFT TUSUNA BASILMAYARAK)
        //Ve ENTER tusuna basin

    }
}
