package practise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P19_Actions extends TestBase {

    @Test
    public void actionsTest() {
        //https://spicejet.com/ sayfasina gidelim
        driver.get("http://spicejet.com");

        //Sayfanin altindaki about us bölümü Careers linkine tiklayalim
        WebElement aboutUs = driver.findElement(By.xpath("//*[.='About Us']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutUs).perform();
        driver.findElement(By.xpath("//*[text()='Careers']")).click();

        //Sayfa basliginin Careers icerdigini test edelim
        Assert.assertTrue(driver.getTitle().contains("Careers"));





    }
}
