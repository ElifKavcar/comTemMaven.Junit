package tem11_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class T04_FileDownloadTest extends TestBase {

    @Test
    public void fileDownloadTest() {

        //   1.Class : FileDownloadTest Method : downloadTestExist
        //   2.https://testcenter.techproeducation.com/index.php?page=filedownload adresine gidelim.
        //   3.b10 all test cases dosyasını indirelim
        //   4.Dosyanın başarıyla indirilip indirilmediğini test edelim

        //   1.Class : FileDownloadTest Method : downloadTestExist

             //   2.https://testcenter.techproeducation.com/index.php?page=filedownload adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");


             //   3.b10 all test cases dosyasını indirelim

        driver.findElement(By.partialLinkText("b10 all test cases")).click();
        waitFor(5);

             //   4.Dosyanın başarıyla indirilip indirilmediğini test edelim
        String filePath = System.getProperty("user.home")+"\\Download\\b10 all test cases, code.docx";
        System.out.println(filePath);

        boolean indirildiMi = Files.exists(Paths.get(filePath));
        Assert.assertTrue(indirildiMi);



    }
}
