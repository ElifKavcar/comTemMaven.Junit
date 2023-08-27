package tem07_testbaseAlert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Homework extends TestBase {
    @Test
    public void test01() {
         //https://demoqa.com/ url'ine gidin.
        driver.get("https://demoqa.com/");

 //Alerts, Frame & Windows Butonuna click yap
  driver.findElement(By.xpath("(//*[@fill='currentColor'])[3]")).click();



 //""Please select an item from left to start practice."" yazısının görünür olduğunu doğrula
 //Sol'da açılan Menu den ""Browser Windows"" butonuna click yap
 //New Tab butonunun görünür olduğunu doğrula
 //New Tab butonuna click yap
 //Açılan yeni Tab da ""This is a sample page"" yazısının görünür olduğunu doğrula
 //İlk Tab'a geri dön
 //New Tab butonunun görünür olduğunu doğrula
    }
}
