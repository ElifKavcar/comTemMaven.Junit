package tem05_JUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework {
    /*//https://www.facebook.com adresine gidin
        //Url'in facebook içerdiğini test(assertion ile)


        //kaydol butonuna tıklayınız
       // Not: Before methodda driver ayarlarını yapınız
          //  After ile sayfayı kapatınız
          */
    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");

    }

    @Test
    public void test01() throws InterruptedException {
        //"Create an Account" button'una basin
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
        Thread.sleep(3000);

        //Çıkan formu doldurunuz
driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("Elif",
        Keys.ENTER, Keys.TAB,"Kavcar",Keys.TAB,"05064444444",Keys.TAB,"1234",Keys.TAB,Keys.TAB,"16",Keys.TAB,"12",Keys.TAB,"1988");
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[@class='_58mt'])[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();


    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}