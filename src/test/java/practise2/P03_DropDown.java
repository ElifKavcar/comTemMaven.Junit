package practise2;

import io.github.bonigarcia.wdm.WebDriverManager;
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

public class P03_DropDown {

static WebDriver driver;
//https://the-internet.herokuapp.com/dropdown adresine gidin
    //Index kullanarak Option 1 secin ve sectiginiz option u yazdirin
    //Value kullanarak Option 1 secin ve sectiginiz option u yazdirin
    //Visible text kullanarak Option 1 secin ve sectiginiz option u yazdirin.
    //Tum option lari yazdirin.
    //dropdown daki optionlarin toplam sayisinin 3 e esit oldugunu test edin.

    @BeforeClass
    public static void beforeClass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

@Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement ddm = driver.findElement(By.xpath("//*[@id='dropdown']"));
    Select options = new Select(ddm);
    options.selectByIndex(1);
    System.out.println("options.getFirstSelectedOption().getText() = " + options.getFirstSelectedOption().getText());
    Thread.sleep(3000);


    options.selectByValue("2");
    System.out.println("options1 = " + options.getFirstSelectedOption().getText());


    options.selectByVisibleText("Option 1");
    System.out.println("options.getFirstSelectedOption().getText() = " + options.getFirstSelectedOption().getText());

    List<WebElement> tumOptions = options.getOptions();

    int sayac = 1;
    for (WebElement each:tumOptions) {
        System.out.println(sayac+" . option "  + each.getText());
        sayac++;
    }
Assert.assertEquals(tumOptions.size(),3);


}



}
