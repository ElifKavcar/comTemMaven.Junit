package homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class DropdownMenu extends TestBase {

    @Test
    public void test01() {

      //  -Amazon sayfasına gidelim
        driver.get("https://amazon.com");

      //  -Arama Kutusundaki Dropdown menuyu yazdıralım
        WebElement option = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select options = new Select(option);
        List<WebElement> optionslar = options.getOptions();
        optionslar.forEach(t-> System.out.println(t.getText()));

      //  -Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
      //  başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım

        for(int i =0; i<5;i++){
            WebElement element = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
           Select select1 = new Select(element);
           select1.selectByIndex(i);
           List<WebElement> menuler = select1.getOptions();
            System.out.println(i+ ". menuler " + menuler.get(i).getText());

        }



    }
}
