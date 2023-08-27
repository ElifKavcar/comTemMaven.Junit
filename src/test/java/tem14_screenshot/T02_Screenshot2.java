package tem14_screenshot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T02_Screenshot2 extends TestBase {

    @Test
    public void screenshotTest() throws IOException {

        //techpro ya git
        driver.get("https://techproeducation.com");

        //sosyal medya simgelerinin resmini çek
        WebElement sosyalMeydaIconlari = driver.findElement(By.xpath("//*[@class='social-links kuculunce-yok']"));
        File image = sosyalMeydaIconlari.getScreenshotAs(OutputType.FILE);

        //  goruntuyu formatini belirle
        String currentTime = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        //  goruntuyu kaydet
        String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+currentTime+"image.png";
        FileUtils.copyFile(image,new File(path));

        //logonun resusable method ile kisa yoldan resmini cektik
        takeScreenshotOfElement(driver.findElement(By.xpath("//*[@src='/logo/headerlogo.svg']")));
    }




}
