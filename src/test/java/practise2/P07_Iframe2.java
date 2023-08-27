package practise2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P07_Iframe2 extends TestBase {
    @Test
    public void test02() {




        //TextBox'in altinda bulunan 'Elemental Selenium' linkinin gorunur oldugunu test edin ve konsolda yazdirin.

//https://the-internet.herokuapp.com/iframe sayfasina gidiniz.
        driver.get("https://the-internet.herokuapp.com/iframe");

        //'An iframe containing the TinyMCE WYSIWYG Editor' basliginin erisilebilir oldugunu test edin
        // ve konsolda yazdirin.
        WebElement anIframe = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(anIframe.isEnabled());
        System.out.println(anIframe.getText());

        //TextBox'a 'Merhaba Dunya' yazin.
        WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe1);

        WebElement text = driver.findElement(By.xpath("//*[@id='tinymce']"));
        text.clear();
        text.sendKeys("Merhaba Dunya");

        driver.switchTo().parentFrame();
        WebElement elemantalSelenium = driver.findElement(By.xpath("//*[@style='text-align: center;']"));
        Assert.assertTrue(elemantalSelenium.isDisplayed());
        System.out.println(elemantalSelenium.getText());


    }
}
