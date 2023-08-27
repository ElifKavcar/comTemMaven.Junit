package tem13_exception;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class T01_NoSuchExeption extends TestBase {
    @Test
    public void testNoSuchExeption(){
        driver.get("https://techproeducation.com");
        driver.findElement(By.xpath("//input[@type='searchh']")).sendKeys("QA"+ Keys.ENTER);






    }



}
