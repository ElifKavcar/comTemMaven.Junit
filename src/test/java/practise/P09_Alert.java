package practise;

import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P09_Alert extends TestBase {
    //go to url : "http://demo.automationtesting.in/Alerts.html"
    //click "Alert with Ok" and click "click the button to display a alert box"
    //accept Alert(I am am alert box!) and print alert on console
    //click "Alert with Ok & Cancel" and click "click the button to display a confirm box"
    //cancel Alert(Press a Button !)
    //click "Alert with Textbox" and click "click the button to denonstrate the prompt box"
    //and then sendKeys "Techproeducation" (Please enter your name)
    //finally print on console this messaje "Hello TechproEducation How are you today"
    //Assertion these messages

    @Test
    public void test01() throws InterruptedException {

      driver.get("http://demo.automationtesting.in/Alerts.html");
WebElement alert = driver.findElement(By.xpath("(//*[@onclick='alertbox()'])"));

alert.click();
Thread.sleep(2000);

        System.out.println(driver.switchTo().alert().getText());//Alert uzerindeki yazıyı konsola yazdirdik
        driver.switchTo().alert().accept(); // Alertte tamam a bastik

        WebElement alertCancel = driver.findElement(By.xpath("(//*[@href='#CancelTab'])"));

        alertCancel.click();
        Thread.sleep(2000);
        WebElement alertCancelYazisi = driver.findElement(By.xpath("//*[@onclick='confirmbox()']"));
        alertCancelYazisi.click();
        Thread.sleep(2000);


       driver.switchTo().alert().dismiss();

driver.findElement(By.xpath("//*[@href='#Textbox']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
Thread.sleep(2000);

driver.switchTo().alert().sendKeys("TechproEducation");
driver.switchTo().alert().accept();

        System.out.println(driver.findElement(By.xpath("//*[@id='demo1']")).getText());
        Assert.assertEquals("Hello TechproEducation How are you today", driver.findElement(By.xpath("//*[@id='demo1']")).getText());
    }
}