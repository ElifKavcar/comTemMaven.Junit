package tem14_screenshot;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T01_Screenshot1 extends TestBase {

    @Test
    public void fullPageScreenshotTest() throws IOException {
        //Class : screenShot1
        //1.Techpro education a git ve Sayfanin goruntusunu al
        driver.get("https://techproeducation.com");

        //   1. Ekran goruntusunu getScreenshorAs methodu ile alip File olarak olusturalim
        File goruntu = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //   2. Almis oldugum ekran goruntusunu belirledigim bir PATH e kaydet.  dir= directory = dosya

        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/EkranGoruntuleri/"+currentDate+"image.png";
        File hedef = new File(path);
        //   3. Goruntum ile dosyami birlestirip kaydet
        FileUtils.copyFile(goruntu,hedef);

        //2.-“QA” aramasi yap
        driver.findElement(By.xpath("//*[@id='searchHeaderInput']")).sendKeys("QA"+Keys.ENTER);
        waitFor(3);

        //3.Acilen sayfanin metnini test et ve ekran goruntusu al: “Search Results for:qa”
        // text = driver.findElement(By.xpath("//*[contains(text(),'Search Results for')]")).getText();
        //Assert.assertTrue("Search Results for :qa".contains(text));

        //  Reusable method yardimi ile ekran goruntusunu alalim
            takeScreenShotOfPage();


    }
}
