package practise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P10_Iframe extends TestBase {

   @Test
   public void test01() throws InterruptedException {

       //https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis// sitesine gidin.
       //ikinci emojiye tiklayin.
       //tüm ikinci emoji ogelerini tiklayin
       //Parent iframe e geri donun
       //formu doldurun,(Formu istediginiz metinlerle doldurun)
       //apply button a basin
driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis//");

driver.switchTo().frame("emoojis");
driver.findElement(By.xpath("(//*[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();


List<WebElement> emojiler= driver.findElements(By.xpath("//*[@id='nature']//img"));

      for (WebElement w:emojiler) {
         w.click();
Thread.sleep(2000);
         driver.switchTo().defaultContent();

     List<WebElement> list = driver.findElements(By.xpath("(//*[@class='mdl-textfield mdl-js-textfield mdl-textfield--floating-label is-upgraded'])[1]"));

List<String> veriler = new ArrayList<>(Arrays.asList("ERol","Evren","e","h","j","k","l","ş","i","f","e"));

          for (int i = 0; i <list.size() ; i++) {
              list.get(i).sendKeys(veriler.get(i));

          }

driver.findElement(By.xpath("//*[text()='Apply']")).click();

      }//BENIMKI CALISMADI KODLARA DEVAM ETMEDIM. FORMU DOLDURMUYOR AMA PASSED OLUYOR NASIL OLUYOR ANLAMADIM
   }




}
