package practise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class P13_WindowHandle2 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
      //https://html.com/tags/iframe/ adresine gidiniz.
      //youtube videosunu calistiriniz
      //uc saniye calistikdan sonra sayfayi yenileyiniz.
        //yeni sekmede amazon adresine gidiniz.
        //iphone aratiniz.
        //arama sonucu olarak sadece sonuc sayisini yazdiriniz.
        //ilk sekmeye geri donup url ini konsola yazdiralim
        //ilk sekmeyi kapatalim
        //sonra diger sekmeyi de kapatalim

driver.get("https://html.com/tags/iframe/");
String ilkHandle = driver.getWindowHandle();
        WebElement iframe1=driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
driver.switchTo().frame(iframe1);
driver.findElement(By.xpath("//*[@aria-label='Oynat']")).click();
Thread.sleep(3000);
driver.navigate().refresh();

driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.amazon.com");
driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone", Keys.ENTER);

WebElement sonucYazisi = driver.findElement(By.xpath("//*[text()='1-16 of 31 results for']"));
String [] sonucYazisiBolme = sonucYazisi.getText().split(" ");
        System.out.println(sonucYazisiBolme[2]);

        driver.switchTo().window(ilkHandle);
        System.out.println(driver.getCurrentUrl());

        driver.close();


    }
}
