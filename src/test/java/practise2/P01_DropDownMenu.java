package practise2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class P01_DropDownMenu {
    static WebDriver driver;
//https://www.amazon.com/ sayfasina gidin.
    //dropdown dan "Books" secenegini secin
    //arama cubuguna "Java" aratin.
    //arama sonuclarinin Java icerdigini test edin
    @BeforeClass
    public static void beforeClass(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
@Test
    public void test01(){
        driver.get("https://www.amazon.com/");

    WebElement ddm = driver.findElement(By.xpath("//*[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
    Select options = new Select(ddm);
    options.selectByVisibleText("Books");

    driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);

    WebElement aramaSonucu = driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
String aramaSonucuYazisi = aramaSonucu.getText();

Assert.assertTrue(aramaSonucuYazisi.contains("Java"));

}




}
