package tem12_fileUpload;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class T01_FileUpload extends TestBase {

    //1. Tests packagenin altina bir class oluşturun :
    //C05_UploadFile
    @Test
    public void fileUploadTest() {


        //2. https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //3. chooseFile butonuna basalim
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));

        //4. Yuklemek istediginiz dosyayi secelim.
        String path = System.getProperty("user.home")+"/Desktop/logo.jpeg";
        chooseFileButton.sendKeys(path);
        waitFor(5);

        //5. Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();


        //6. “File Uploaded!” textinin goruntulendigini test edelim.
        String uploadYazisi = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploaded!", uploadYazisi);
        waitFor(5);




    }
}
