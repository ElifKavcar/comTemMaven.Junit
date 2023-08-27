package tem07_testbaseAlert;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class T04_PromptAlert extends TestBase {

    @Test
            public void promptAlert() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();

        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Elif");
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        String actualResult = driver.findElement(By.id("result")).getText();
        String expectedResult = "You entered: Elif";
        Assert.assertEquals(actualResult, expectedResult);






    }

}
