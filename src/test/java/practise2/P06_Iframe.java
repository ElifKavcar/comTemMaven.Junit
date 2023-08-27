package practise2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P06_Iframe extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        //https://html.com/tags/iframe sayfasina gidiniz.
        driver.get("https://html.com/tags/iframe");

        //Videoyu görecek kadar asagiya ininiz.
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);

        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        driver.switchTo().frame(iframe1);
        //Videoyu izlemek icin Play tusuna basiniz.
        WebElement basmaButonu = driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        basmaButonu.click();

        //Videoyu calistirdiginizi test ediniz.
        WebElement youtube = driver.findElement(By.xpath("//*[@class='ytp-youtube-button ytp-button yt-uix-sessionlink']"));
        Assert.assertTrue(youtube.isDisplayed());

        //"Powerful,but easy to misuse" yazisinin görünür oldugunu test ediniz.
        driver.switchTo().defaultContent();
        WebElement yazi = driver.findElement(By.xpath("//*[@id='Powerful_but_easy_to_misuse']"));
        Assert.assertTrue(yazi.isDisplayed());
    }









}
