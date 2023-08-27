package tem07_testbaseAlert;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class T02_AllertsAccepts extends TestBase {
    @Test
    public void acceptAlertTest() throws InterruptedException {

// 1. butona tiklayin

//ve result mesajinin "You succesfully clicked an alert" oldugunu test edin.
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

// uyaridaki OK butonuna tiklayin
        Thread.sleep(3000);
        driver.
                switchTo().//degistir
                alert().   //alerte degistir
                accept();//OK secenegine tiklanir.

        WebElement sonucYazisi = driver.findElement(By.xpath("//*[@id='result']"));
        Assert.assertEquals(sonucYazisi.getText(),"You successfully clicked an alert");
    }



}






