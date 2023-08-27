package tem07_testbaseAlert;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class T03_DismissAlert extends TestBase {
    @Test
    public void dismissAlert() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();

        //Cancel butonuna tiklayiniz.
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);
        String gelenYazi = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String gercekYazi = "You clicked: Cancel";
        Assert.assertEquals(gelenYazi,gercekYazi);

        //result mesajinin "You clicked: Cancel" oldugunu test edelim.

    } }
