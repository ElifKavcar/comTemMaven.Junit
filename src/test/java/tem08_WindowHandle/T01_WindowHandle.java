package tem08_WindowHandle;

import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

public class T01_WindowHandle extends TestBase {
    //https://the-internet.herokuapp.com/windows adresine gidin.
    //Sayfadaki textin "Opening a new window" oldugunu dogrulayin.
    //Sayfa basliginin(title) "The Internet" oldugunu dogrulayin.
    //Click Here butonuna basin.
    //Acilan yeni pencerenin sayfa basliginin (title) "New Window" oldugunu dogrulayin..
    //Sayfadaki textin "New Window" oldugunu dogrulayin.
    //Bir önceki pencereye geri dondukten sonra sayfa basliginin "The Internet" oldugunu dogrulayin
@Test
    public void testWindowHandle() throws InterruptedException {

    driver.get("https://the-internet.herokuapp.com/windows");

    String window1Handle = driver.getWindowHandle();


    String yeniPencere = driver.findElement(By.xpath("//h3")).getText();
    String text = "Opening a new window";
    Assert.assertEquals(text, yeniPencere);

    String sayfaBasligi = driver.getTitle();
    String expectedBasligi = "The Internet";
    Assert.assertEquals(sayfaBasligi, expectedBasligi);

    driver.findElement(By.xpath("//*[@href='/windows/new']")).click();
    Thread.sleep(5000);

    //BU NOKTADA 2 PENCERE ACIK VE IKINCISINE GECIS YAPMAK ISTIYORUM
    //BUNUN ICIN driver.getWindowhandles() ile TUM PENCERELERIN ID LERINI ALALIM

    Set<String> allWindowHandles = driver.getWindowHandles();//{window1handle,window2handle}
    System.out.println(allWindowHandles);
    for(String eachHandle: allWindowHandles){

        //eger listedeki id window1 e esit degilse bir sonrakine esittir.
        if(!eachHandle.equals(window1Handle)){
            driver.switchTo().window(eachHandle);//Buradaki eachHandle window2 handle a esittir.
break;
        }
    }
    //BU NOKTADA DRİVER 2. PENCEREDE

    Assert.assertEquals("New Window",driver.findElement(By.xpath("//h3")).getText());

String windowHandle2 = driver.getWindowHandle();
Thread.sleep(3000);
driver.switchTo().window(window1Handle);
Assert.assertEquals("The Internet",driver.getTitle());

Thread.sleep(3000);
driver.switchTo().window(windowHandle2);
Thread.sleep(3000);



}

    }














