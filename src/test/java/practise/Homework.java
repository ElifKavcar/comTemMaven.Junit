package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework {

    //  1. Yeni bir Class olusturalim.C05_NavigationMethods
    //  2. Youtube ana sayfasina gidelim .https://www.youtube.com/
    //  3. Amazon soyfasina gidelim. https://www.amazon.com/
    //  4. Tekrar YouTube’sayfasina donelim
    //  5. Yeniden Amazon sayfasina gidelim
    //  6. Sayfayi Refresh(yenile) yapalim
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  2. Youtube ana sayfasina gidelim .https://www.youtube.com/
        driver.get("https://www.youtube.com/");

        //  3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //  4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //  5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        Thread.sleep(3000);

        //  6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        Thread.sleep(3000);


        //  7.Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.quit();
        Thread.sleep(3000);

    }
}