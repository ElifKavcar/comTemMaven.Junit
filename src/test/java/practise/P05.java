package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {

   static WebDriver driver;


    @BeforeClass
            public static void beforeClass() {



        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

}
@Before
public void setup() {
       driver.get("https://google.com");

}
@Test
    public void test01(){
    WebElement aramaKutusu = driver.findElement(By.xpath("//*[@class='gLFyf']"));
    aramaKutusu.sendKeys("The God Father", Keys.ENTER);


    }
    @Test
    public void test02(){

        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaKutusu.sendKeys("Lord of the Rings", Keys.ENTER);

    }
    @Test
    public void test03(){
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaKutusu.sendKeys("Kill Bill", Keys.ENTER);

    }
@After
    public void tearDown() {
    String [] aramaSonucYazisi =    driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
    System.out.println(aramaSonucYazisi[1]);

}
@AfterClass
    public static void afterClass(){
        driver.close();
}
}
