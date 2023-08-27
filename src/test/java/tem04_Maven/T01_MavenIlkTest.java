package tem04_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class T01_MavenIlkTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        WebElement aramakutusu = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        aramakutusu.sendKeys("Samsung headphones");
        aramakutusu.submit();


       WebElement aramaSonucYazisi = driver.findElement(By.xpath("//*[@class='a-color-state a-text-bold']"));
        System.out.println("aramaSonucYazisi = " + aramaSonucYazisi.getText());

        driver.findElement(By.xpath("//*[@alt='Sponsored Ad - Raycon The Everyday Wireless Bluetooth Over Ear Headphones, with Active Noise Cancelling, Awareness Mode an...']")).click();

       List<WebElement> sayfaBasliklari = driver.findElements(By.xpath("//h1"));
        for (WebElement w : sayfaBasliklari) {
            System.out.println(w.getText());
        }
        driver.close();

    }

}
