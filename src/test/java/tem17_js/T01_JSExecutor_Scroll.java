package tem17_js;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.IOException;

public class T01_JSExecutor_Scroll extends TestBase {
    @Test
    public void scrollIntoViewTest() throws IOException {

     //   1)scrollIntoViewTest metotu olustur
     //   2)Techpro education ana sayfasina git
     //   3)We Offer elementi gorunur olacak sekilde uzerine scroll et ve ekran
     //   gorunturunu al
     //   4)Ayni sayfada Enroll Free elementi gorunur olacak sekilde scroll et ve
     //   ekran goruntusunu al
     //   5)Ayni sayfada WHY US? elementi gorunur olacak sekilde scroll et ve
     //   ekran goruntusunu al
     //   6)Ayni sayfada tekrar Enroll Free elementi gorunur olacak sekilde scroll
     //   et ve ekran goruntusunu al

        //   1)scrollIntoViewTest metotu olustur
               //   2)Techpro education ana sayfasina git
        driver.get("https://techproeducation.com");

        //   3)"Events" elementi gorunur olacak sekilde uzerine scroll et ve ekran
        //   gorunturunu al

                         //   1. Elementi bul
        WebElement events = driver.findElement(By.xpath("(//h2)[1]"));

                        // 2. JS executor objesi olustur.
        JavascriptExecutor js = (JavascriptExecutor)driver;

                        // 3. Yapmak istedigim islemi js.executeScript metodu ile yap
        //   scrollIntoView(true) metodu belirli bir elemente scroll yapmak icin kullanilir
        //  arguments[0] ILK PARAMETREDEKI ELEMENT
            js.executeScript("arguments[0].scrollIntoView(true);",events);
            waitFor(3);

                    // reusable metod ile goruntu alicaz

        takeScreenShotOfPage();

                //   4)Ayni sayfada "Testimonials" elementi gorunur olacak sekilde scroll et ve
                //   ekran goruntusunu al
        WebElement testimonials = driver.findElement(By.xpath("(//h2)[2]"));
        js.executeScript("arguments[0].scrollIntoView(true);",testimonials);
        waitFor(3);
        takeScreenShotOfPage();

        //   5)Ayni sayfada "Companies our alumni are employed at" elementi gorunur olacak sekilde scroll et ve
        //   ekran goruntusunu al
        WebElement companies = driver.findElement(By.xpath("(//h2)[3]"));
        js.executeScript("arguments[0].scrollIntoView(true);",testimonials);
        waitFor(3);
        takeScreenShotOfPage();

        //   6)Ayni sayfada tekrar "Testimonials" elementi gorunur olacak sekilde scroll
        //   et ve ekran goruntusunu al
        WebElement testimonials1 = driver.findElement(By.xpath("(//h2)[2]"));
        js.executeScript("arguments[0].scrollIntoView(true);",testimonials1);
        waitFor(3);
        takeScreenShotOfPage();

                 //        EN USTE GIT
        scrollTopJS();
        waitFor(3);

                 //        EN ALTA GIT
        scrollEndJS();
        waitFor(3);
    }
}
