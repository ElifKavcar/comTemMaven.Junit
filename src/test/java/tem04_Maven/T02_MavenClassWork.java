package tem04_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T02_MavenClassWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");

        String sayfaBasligi = driver.getTitle();
        if(sayfaBasligi.contains("Google")){
            System.out.println("Passed");
        }else System.out.println("Failed");

        WebElement aramaCubugu = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        aramaCubugu.sendKeys("Nutella");
        aramaCubugu.submit();

        WebElement aramaSonucYazisi = driver.findElement(By.xpath("//*[@id='result-stats']"));
        System.out.println(aramaSonucYazisi.getText());

        String [] sonucSayisi = aramaSonucYazisi.getText().split(" ");
        System.out.println("sonucSayisi : " + sonucSayisi[1]);
        //String [] sonucsayisi = aramaSonucYazisi.get(0).getText().split(" ");
        //System.out.println("Sonuc sayisi : " + sonucsayisi[2]);


       // if(sonucSayisi[1]  10.000.000 ){
            driver.close();



        }



    }

