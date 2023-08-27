package practise2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class P02_DroDownOptions {
    static WebDriver driver;

    //https://www.amazon.com/ sayfasina gidin.
    //dropdown dan "Baby" secenegini secin
    //sectiginiz option i yazdirin.
    //dropdown daki optionlarin toplam sayisinin 28 e esit oldugunu test edin.

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
@After
public void tearDown() {
        driver.close();
}

    @Test
    public void test01() {
        driver.get("https://www.amazon.com/");
        WebElement ddm = driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
        Select options = new Select(ddm);
        options.selectByVisibleText("Baby");

        String sectigimOption = options.getFirstSelectedOption().getText();
        System.out.println("sectigimOption = " + sectigimOption);

       List<WebElement> tumOpsiyonlar = options.getOptions();
       int actualOptionSayisi = tumOpsiyonlar.size();
       int expectedOptionSayisi = 28;
       Assert.assertEquals(expectedOptionSayisi, actualOptionSayisi);

    }
}