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

public class P04_CheckBox {
 WebDriver driver;

@Before
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

}

@Test
    public void test01(){
    //https://demo.guru99.com/test/radio.html adresine gidin
    //checkbox elementlerini locate edin.
    //checkbox1 ve checkbox3 secili degil ise secin.
    //checkbox1 ve checkbox3 elementlerinin secili oldugunu test edin.
    //checkbox2 elementinin secili olmadigini test edin.

    driver.get("https://demo.guru99.com/test/radio.html");
    WebElement checkBox1 = driver.findElement(By.xpath("//*[@value='checkbox1']"));
    WebElement checkBox2 = driver.findElement(By.xpath("//*[@value='checkbox2']"));
    WebElement checkBox3 = driver.findElement(By.xpath("//*[@value='checkbox3']"));

    if(!checkBox1.isSelected()&&!checkBox3.isSelected()){
        checkBox1.click();
        checkBox3.click();
    }
    Assert.assertTrue(checkBox1.isSelected());
    Assert.assertTrue(checkBox3.isSelected());
    Assert.assertFalse(checkBox2.isSelected());
}



}
