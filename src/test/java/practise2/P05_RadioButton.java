package practise2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05_RadioButton {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() {
        //https://demo.guru99.com/test/radio.html adresine gidin
        //radiobutton elementlerini locate edin.
        //option2 yi secin.
        //option2 elementlerinin secili oldugunu test edin.
        //option1 elementlerinin secili olmadigini test edin.
        //option3 elementlerinin secili olmadigini test edin.

        driver.get("https://demo.guru99.com/test/radio.html");

WebElement option1 = driver.findElement(By.xpath("//*[@value='Option 1']"));
WebElement option2 = driver.findElement(By.xpath("//*[@value='Option 2']"));
WebElement option3 = driver.findElement(By.xpath("//*[@value='Option 3']"));

if(!option2.isSelected()){
    option2.click();
}

        Assert.assertTrue(option2.isSelected());
        Assert.assertFalse(option1.isSelected());
        Assert.assertFalse(option3.isSelected());



    }
}