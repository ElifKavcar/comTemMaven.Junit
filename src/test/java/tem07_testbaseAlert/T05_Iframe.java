package tem07_testbaseAlert;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class T05_Iframe extends TestBase {
    @Test
    public void iframeTest(){
       driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

       //An iframe with a thin black border: metninde 'black border' yazisinin oldugunu dogrulayalim
        //Applications lists yazisinin sayfada oldugunu test edelim.
        //Son olarak footer daki "Powered By" yazisinin varligini test edelim.

        //String actualyazi = driver.findElement(By.xpath("//p[.='An iframe with a thin black border:']")).getText();
        //String expectedyazi = "black border";
        //Assert.assertTrue(actualyazi.contains(expectedyazi));

driver.switchTo().frame(0);

String icMetin = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div/h1")).getText();
String expectedText1 = "Applications lists";
Assert.assertEquals(expectedText1, icMetin);

driver.switchTo().defaultContent();
String disYazi = driver.findElement(By.xpath("/html/body/footer/p[1]")).getText();
String beklenen = "Povered By";
Assert.assertTrue(disYazi.contains(beklenen));









    }
}
