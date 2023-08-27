package homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class H01_Iframe extends TestBase {


    //https://the-internet.herokuapp.com/iframe sitesine gidiniz.
    //sayfadaki toplam iframe sayisini bulunuz.
    //sayfa basliginda "Editor" yazisini icerdigini test edelim.
    // paragraftaki yaziyi silelim.
    // Sonrasinda paragrafa "iframe in icindeyim" yazisini yazdiralim.
    // Alt kisminda yazinin "Elemental Selenium" yazisini icerdigini test edelim.

@Test
    public  void testIframe() throws InterruptedException {
    driver.get("https://the-internet.herokuapp.com/iframe");
    List<WebElement> iframeSayisi = driver.findElements(By.tagName("iframe"));
    System.out.println(iframeSayisi.size());

    String editorYazisi = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText();
    String beklenen = "Editor";
    Assert.assertTrue(editorYazisi.contains(beklenen));

    driver.switchTo().frame(0);
    driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).clear();

    Thread.sleep(5000);

    driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).sendKeys("iframe in icindeyim");
    Thread.sleep(5000);

    driver.switchTo().defaultContent();
    String beklenen2 = driver.findElement(By.xpath("//*[@href='http://elementalselenium.com/']")).getText();
    String olan = "Elemental Selenium";
    Assert.assertTrue(beklenen2.contains(olan));




}




}
