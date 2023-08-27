package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class P06 {
    static WebDriver driver;
    /*
    -ebay sayfasina gidiniz.
    -electronics bolumune tiklayiniz.
    -Genisligi 225 ve uzunlugu 225 olan resimlerin hepsine tiklayalim
    -her sayfanin sayfa basligini yazdiralim
    -sayfayi kapatalim
     */
    @BeforeClass
    public static void setup() throws Exception {


        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

@Test
    public void test01() throws InterruptedException {
    driver.get("https://ebay.com");
    driver.findElement(By.xpath("(//*[text()='Electronics'])[2]")).click();


for (int i = 0; i < 24; i++){
    List<WebElement> resimler = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
    resimler.get(i).click();
    Thread.sleep(3000);
    System.out.println(i+". başlık : "+driver.getTitle());
    Thread.sleep(3000);
    driver.navigate().back();
    Thread.sleep(3000);

}
driver.close();
}


}
