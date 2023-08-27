package tem13_exception;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class T04_StaleElementReferenceException extends TestBase {


    @Test
    public void staleElementReferenceExceptionTest() {
        driver.get("https://techproeducation.com");

     //LMS LOGIN linkine tikla ve o sayfanin URL inin lms icerdigini test et
        WebElement lmsLoginLink = driver.findElement(By.linkText("LMS"));
        waitFor(3);
        lmsLoginLink.click();  // LMS e git
        Assert.assertTrue(driver.getCurrentUrl().contains("lms")); // URL nin lms kelimesi icerdigini test et
        waitFor(3);
     //Tekrar ana sayfaya gel ve LMS LOGIN sayfasina tekrar gel
        //driver.navigate().back();  // tekrar ana sayfaya gittik
        //waitFor(3);
        //lmsLoginLink.click(); // LMS e git
    }
    @Test
    public void staleElementReferenceExceptionTest2(){
        driver.get("https://techproeducation.com");
        waitFor(3);
        WebElement lmsLoginLink = driver.findElement(By.linkText("LMS"));
        waitFor(3);
        driver.navigate().refresh();
        waitFor(3);

        // sayfa yenilenmeden once buldugum elementı sayfa yenilendikten sonra tekrar kullanmak istedim
        lmsLoginLink.click();

        // COZUM ESKI (SLATE ELEMENT) ELEMENTI TEKRAR LOCATE ET
        //driver.findElement(By.linkText("LMS")).click();
    }
}
