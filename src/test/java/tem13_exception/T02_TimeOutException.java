package tem13_exception;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class T02_TimeOutException extends TestBase {

    @Test
    public void timeOutExceptionTest() {

        driver.get("https://techproeducation.com");

        //  Explicit wait icin olusturdugumuz methodalrdan birini kullanalim
        //Parametre 1 : beklemek istedigim element, Parametre 2 : Max sure

       // waitForVisibility(driver.findElement(By.xpath("//input[@type = 'searchh!]")),15).sendKeys(("QA"+ Keys.ENTER));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yanlis id")));


    }
}
