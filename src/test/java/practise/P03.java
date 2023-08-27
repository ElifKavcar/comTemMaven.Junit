package practise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Navigate to https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //Click on calculate under micro apps
        driver.findElement(By.xpath("//*[@id='calculatetest']")).click();

        //Type any number in the first input
        WebElement sayi1 = driver.findElement(By.xpath("//*[@id='number1']"));
        sayi1.sendKeys("17", Keys.TAB,Keys.TAB,"35",Keys.TAB,Keys.SPACE);


        //Type any number in the second input
        //Click on Calculate
        //Print the result
        WebElement sonuc = driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("sonuc = " + sonuc.getText());

        //close driver
        driver.close();


    }}
