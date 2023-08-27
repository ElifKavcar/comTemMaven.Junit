package tem09_WindowHandleBasicAuthentication;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class T01_WindowHandle2 extends TestBase {


    @Test
    public void test01() {

        //https://the-internet.herokuapp.com/windows adresine gidin.
       driver.get("https://the-internet.herokuapp.com/windows");
       String window1Handle= driver.getWindowHandle();

        //Sayfadaki textin "Opening a new window" oldugunu dogrulayin
        WebElement newWindow = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals(newWindow.getText(),"Opening a new window");

        //Sayfa basliginin "The Internet" oldugunu dogrulayin.
        Assert.assertEquals(driver.getTitle(),"The Internet");

        //Click Here butonuna basin.
        WebElement clickButonu = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickButonu.click();
        waitFor(3);//TestBase de Thread.sleep kısayolu

//IKINCI PENCERE ACILIR VE IKINCI PENCEREDE ISLEM YAPMAK ISTEDIGIMDEN,O PENCEREYE SWITCH YAPMALIYIZ.
        //Acilan yeni pencerenin sayfa basliginin (title) "New Window" oldugunu dogrulayin

        switchToWindow(1);
        String window2Baslik = driver.getTitle();
        Assert.assertEquals("New Window",window2Baslik);

        //Sayfadaki textin "New Window" oldugunu dogrulayin.



        //Bir onceki pencereye geri dondukten sonra sayfa basliginin "The Internet" oldugunu dogrulayin.



    }
}
