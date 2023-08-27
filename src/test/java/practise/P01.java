package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");
        String sayfaBasligi = driver.getTitle();
        System.out.println("sayfaBasligi = " + sayfaBasligi);

        String sayfaUrl = driver.getCurrentUrl();
        System.out.println("sayfaUrl = " + sayfaUrl);
//title ve url nin "Spend" kelimesi icerip icermedigini kontrol edelim

        // if(sayfaBasligi.contains("spend")){
        //    System.out.println("Passed");
        //}else System.out.println("Failed");
        //if(sayfaUrl.contains("spend")){
        //    System.out.println("Passed");
       // }else System.out.println("Failed");

        Assert.assertFalse(sayfaBasligi.
                contains("Spend")&&sayfaUrl.contains("Spend"));

        driver.get("https://trendyol.com");
        String trendyolBaslik = driver.getTitle();
        //if(trendyolBaslik.contains("Sitesi")){
        //    System.out.println("Passed");
        //}else System.out.println("Failed");
        Assert.assertTrue(trendyolBaslik.contains("Sitesi"));

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.quit();




    }



    }
