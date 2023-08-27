package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P07 {
    static WebDriver driver;
    /*
    -https://www.google.com/ adrsine gidin.
    -cookies uyarisini kabul ederek kapatin.
    -Sayfa basliginin "Google" ifadesi icerdigini test edin
    -Arama cubuguna "Nutella" yazip aratin.
    -Bulunan sonuc sayisini yazdirin.
    -sonuc sayisinin 10 milyondan fazla oldugunu test edin.
    -sayfayi kapatin
    */
  @BeforeClass
  public static void setup(){
      WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

  }
    @Test
    public void test01(){
      driver.get("https://www.google.com");
        Assert.assertEquals("Google",driver.getTitle());

        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Nutella", Keys.ENTER);

        String [] sonucSayisi = driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
        String sonuc = sonucSayisi[1];
        System.out.println("sonucSayisi = " + sonuc);

sonuc = sonuc.replaceAll("\\D","");//ReplaceAll methodu ile \\D i kullanarak butun noktalama isaretlerini hiclik ile degistir.
       int istenenSayi = 10000000;
       Assert.assertTrue(Integer.parseInt(sonuc)>istenenSayi);
driver.close();
    }

    }













