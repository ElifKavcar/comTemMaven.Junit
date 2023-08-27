package practise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class P11_Iframe2 extends TestBase {
    @Test
    public void test01() throws InterruptedException {

      //https://demo.guru99.com/test/guru99home/ sitesine gidiniz.
      //sayfadaki iframe sayisini bulunuz.
      //ilk iframe deki (Youtube) play butonuna tiklayiniz.
        //ilk iframe den cikip ana sayfaya dönünüz.
        //ikinci iframe deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tiklayiniz.

        driver.get("https://demo.guru99.com/test/guru99home/");
        List<WebElement> iframeSayisi = driver.findElements(By.xpath("//iframe"));
        System.out.println(iframeSayisi.size());

        WebElement iframeYeri = driver.findElement(By.xpath("//*[@wmode='transparent']"));
        driver.switchTo().frame(iframeYeri);
        driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
        Thread.sleep(3000);

        driver.switchTo().defaultContent();

        WebElement jMeter = driver.findElement(By.xpath("//*[@id='a077aa5e']"));
        driver.switchTo().frame(jMeter);
        driver.findElement(By.xpath("//*[@src='Jmeter720.png']")).click();

    }
}
