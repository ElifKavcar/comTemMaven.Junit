package practise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class P14_WindowHandle3 extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //https://the-internet.herokuapp.com/iframe adresine gidiniz


        //Elemental Selenium başlıgı altındaki "Source Labs" linkinin görünür oldugunu test edin
        //Source Labs linkine tıklayın
        //Açılan sayfada sayfa başlığını yazdırın
        //ilk sekmeye ger dönelim ve url ini yazdıralım
        //ilk sekmeyi kapatalım

        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement iframe1 = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe1);

        //An iframe containing ... baslıgının altındaki Text Box a "Tecproeducation" yazın
        WebElement iframeIci = driver.findElement(By.xpath("//p"));
        iframeIci.clear();
        iframeIci.sendKeys("Techproeducation");
        Thread.sleep(3000);


//TexBox ın altında bulunan "Elemental Selenium" linkinin görünür oldugunu test edin
        driver.switchTo().defaultContent();

        String actual = driver.findElement(By.xpath("//*[@href='http://elementalselenium.com/']")).getText();
        String expected = "Elemental Selenium";
        Assert.assertTrue(actual.contains(expected));

//Elemental Selenium linkine tıklayın
        WebElement elementSelenium = driver.findElement(By.xpath("//*[@href='http://elementalselenium.com/']"));
        elementSelenium.click();

    //Açılan sayfada sayfa başlıgını yazdirin

    List<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(windowHandles);
        driver.switchTo().window(windowHandles.get(1));
      /*
        Set<String> windowHandleSeti = driver.getWindowHandles();
        System.out.println(windowHandleSeti);
        String ikinciSayfaWindowHandleDegeri = "";
        for (String each : windowHandleSeti) {
            if(!each.equals("ilkSayfaWindowHandleDegeri")){
                ikinciSayfaWindowHandleDegeri = each;
                */
        System.out.println(driver.getTitle());



    }
}