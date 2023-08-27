package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class P04 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Navigate to https://the-internet.herokuapp.com/add_remove_elements/
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna 100 defa basiniz.
        WebElement addTusu = driver.findElement(By.xpath("//*[@onclick='addElement()']"));

        for (int i = 0; i <100;  i++) {
            addTusu.click();
        }
        //100 defa basildigini test ediniz.

        List<WebElement> yuzDefaMi = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        Assert.assertEquals(yuzDefaMi.size(), 100);

        //90 defa delete tusuna basiniz.
        WebElement deleteTusu = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        for (int i = 0; i <90 ; i++) {
            deleteTusu.click();
        }

        //90 defa basildigini dogrulayiniz.
        List<WebElement> doksanMi = driver.findElements(By.xpath("////*[@onclick='deleteElement()']"));

        Assert.assertEquals(doksanMi.size(),10);


        //Sayfayi kapatiniz.
        driver.close();

    }



}