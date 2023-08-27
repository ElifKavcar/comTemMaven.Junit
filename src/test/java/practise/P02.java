package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class P02 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //go to url https://www.techlistic.com/p/selenium-practise-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //fill the firstname
       // driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Elif");

        //fill the lastname
        //driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kavcar");

        //check the gender
       // driver.findElement(By.xpath("//label[@class='radio']")).click();

        //KISA YOL!!!! bir secenekten digerine kolay geciş yolu
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.
                sendKeys("Elif", Keys.TAB,"Kavcar",Keys.
                        TAB,Keys.ARROW_RIGHT, Keys.TAB,Keys.ARROW_RIGHT,Keys.
                        ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.
                        TAB,"12.12.2004",Keys.TAB,Keys.TAB,Keys.SPACE,Keys.
                        TAB,Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,"Africa",Keys.TAB,Keys.
                        LEFT_CONTROL,Keys.SPACE,Keys.
                        ARROW_DOWN,Keys.ARROW_DOWN,Keys.SPACE,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);


        //check the experience
        //fill the date
        //choose your profession -> Automation Tester
        //choose your tool -> Selenium Webdriver
        //choose your continent -> Antartica
        //choose your command -> Browser Commands
        //click submit button







    }
}
